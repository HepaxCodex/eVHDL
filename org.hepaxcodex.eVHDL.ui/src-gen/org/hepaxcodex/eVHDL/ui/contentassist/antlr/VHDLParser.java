/*
* generated by Xtext
*/
package org.hepaxcodex.eVHDL.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.hepaxcodex.eVHDL.services.VHDLGrammarAccess;

public class VHDLParser extends AbstractContentAssistParser {
	
	@Inject
	private VHDLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.hepaxcodex.eVHDL.ui.contentassist.antlr.internal.InternalVHDLParser createParser() {
		org.hepaxcodex.eVHDL.ui.contentassist.antlr.internal.InternalVHDLParser result = new org.hepaxcodex.eVHDL.ui.contentassist.antlr.internal.InternalVHDLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEntity_declarationAccess().getGroup(), "rule__Entity_declaration__Group__0");
					put(grammarAccess.getEntity_headerAccess().getGroup(), "rule__Entity_header__Group__0");
					put(grammarAccess.getGeneric_clauseAccess().getGroup(), "rule__Generic_clause__Group__0");
					put(grammarAccess.getPort_clauseAccess().getGroup(), "rule__Port_clause__Group__0");
					put(grammarAccess.getVHDLPagckageAccess().getElementsAssignment(), "rule__VHDLPagckage__ElementsAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.hepaxcodex.eVHDL.ui.contentassist.antlr.internal.InternalVHDLParser typedParser = (org.hepaxcodex.eVHDL.ui.contentassist.antlr.internal.InternalVHDLParser) parser;
			typedParser.entryRulevHDLPagckage();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VHDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VHDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
