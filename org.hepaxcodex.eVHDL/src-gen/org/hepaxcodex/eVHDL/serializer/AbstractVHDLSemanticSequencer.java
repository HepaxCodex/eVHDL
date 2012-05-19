package org.hepaxcodex.eVHDL.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.hepaxcodex.eVHDL.services.VHDLGrammarAccess;
import org.hepaxcodex.eVHDL.vHDL.VHDLPackage;
import org.hepaxcodex.eVHDL.vHDL.vHDLPagckage;

@SuppressWarnings("restriction")
public class AbstractVHDLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected VHDLGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VHDLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VHDLPackage.VHDL_PAGCKAGE:
				if(context == grammarAccess.getVHDLPagckageRule()) {
					sequence_vHDLPagckage(context, (vHDLPagckage) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     elements+=entity_declaration
	 */
	protected void sequence_vHDLPagckage(EObject context, vHDLPagckage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
