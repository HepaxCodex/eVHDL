/*
* generated by Xtext
*/
grammar InternalVHDL;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.hepaxcodex.eVHDL.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.hepaxcodex.eVHDL.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.hepaxcodex.eVHDL.services.VHDLGrammarAccess;

}

@parser::members {
 
 	private VHDLGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(VHDLGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRulevHDLPagckage
entryRulevHDLPagckage 
:
{ before(grammarAccess.getVHDLPagckageRule()); }
	 rulevHDLPagckage
{ after(grammarAccess.getVHDLPagckageRule()); } 
	 EOF 
;

// Rule vHDLPagckage
rulevHDLPagckage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVHDLPagckageAccess().getElementsAssignment()); }
(rule__VHDLPagckage__ElementsAssignment)
{ after(grammarAccess.getVHDLPagckageAccess().getElementsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleentity_declaration
entryRuleentity_declaration 
:
{ before(grammarAccess.getEntity_declarationRule()); }
	 ruleentity_declaration
{ after(grammarAccess.getEntity_declarationRule()); } 
	 EOF 
;

// Rule entity_declaration
ruleentity_declaration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntity_declarationAccess().getGroup()); }
(rule__Entity_declaration__Group__0)
{ after(grammarAccess.getEntity_declarationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleentity_header
entryRuleentity_header 
:
{ before(grammarAccess.getEntity_headerRule()); }
	 ruleentity_header
{ after(grammarAccess.getEntity_headerRule()); } 
	 EOF 
;

// Rule entity_header
ruleentity_header
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntity_headerAccess().getGroup()); }
(rule__Entity_header__Group__0)
{ after(grammarAccess.getEntity_headerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulegeneric_clause
entryRulegeneric_clause 
:
{ before(grammarAccess.getGeneric_clauseRule()); }
	 rulegeneric_clause
{ after(grammarAccess.getGeneric_clauseRule()); } 
	 EOF 
;

// Rule generic_clause
rulegeneric_clause
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGeneric_clauseAccess().getGroup()); }
(rule__Generic_clause__Group__0)
{ after(grammarAccess.getGeneric_clauseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleport_clause
entryRuleport_clause 
:
{ before(grammarAccess.getPort_clauseRule()); }
	 ruleport_clause
{ after(grammarAccess.getPort_clauseRule()); } 
	 EOF 
;

// Rule port_clause
ruleport_clause
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPort_clauseAccess().getGroup()); }
(rule__Port_clause__Group__0)
{ after(grammarAccess.getPort_clauseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulegeneric_list
entryRulegeneric_list 
:
{ before(grammarAccess.getGeneric_listRule()); }
	 rulegeneric_list
{ after(grammarAccess.getGeneric_listRule()); } 
	 EOF 
;

// Rule generic_list
rulegeneric_list
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGeneric_listAccess().getIDTerminalRuleCall()); }
	RULE_ID
{ after(grammarAccess.getGeneric_listAccess().getIDTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleport_list
entryRuleport_list 
:
{ before(grammarAccess.getPort_listRule()); }
	 ruleport_list
{ after(grammarAccess.getPort_listRule()); } 
	 EOF 
;

// Rule port_list
ruleport_list
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPort_listAccess().getIDTerminalRuleCall()); }
	RULE_ID
{ after(grammarAccess.getPort_listAccess().getIDTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Entity_declaration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity_declaration__Group__0__Impl
	rule__Entity_declaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity_declaration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntity_declarationAccess().getEntityKeyword_0()); }

	'entity' 

{ after(grammarAccess.getEntity_declarationAccess().getEntityKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity_declaration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity_declaration__Group__1__Impl
	rule__Entity_declaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity_declaration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntity_declarationAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getEntity_declarationAccess().getIDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity_declaration__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity_declaration__Group__2__Impl
	rule__Entity_declaration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity_declaration__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntity_declarationAccess().getIsKeyword_2()); }

	'is' 

{ after(grammarAccess.getEntity_declarationAccess().getIsKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity_declaration__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity_declaration__Group__3__Impl
	rule__Entity_declaration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity_declaration__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntity_declarationAccess().getEntity_headerParserRuleCall_3()); }
	ruleentity_header
{ after(grammarAccess.getEntity_declarationAccess().getEntity_headerParserRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity_declaration__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity_declaration__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity_declaration__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntity_declarationAccess().getEndKeyword_4()); }

	'end' 

{ after(grammarAccess.getEntity_declarationAccess().getEndKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Entity_header__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity_header__Group__0__Impl
	rule__Entity_header__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity_header__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntity_headerAccess().getGeneric_clauseParserRuleCall_0()); }
(	rulegeneric_clause)?
{ after(grammarAccess.getEntity_headerAccess().getGeneric_clauseParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity_header__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity_header__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity_header__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntity_headerAccess().getPort_clauseParserRuleCall_1()); }
(	ruleport_clause)?
{ after(grammarAccess.getEntity_headerAccess().getPort_clauseParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Generic_clause__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Generic_clause__Group__0__Impl
	rule__Generic_clause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Generic_clause__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGeneric_clauseAccess().getGenericKeyword_0()); }

	'generic' 

{ after(grammarAccess.getGeneric_clauseAccess().getGenericKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Generic_clause__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Generic_clause__Group__1__Impl
	rule__Generic_clause__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Generic_clause__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGeneric_clauseAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getGeneric_clauseAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Generic_clause__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Generic_clause__Group__2__Impl
	rule__Generic_clause__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Generic_clause__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGeneric_clauseAccess().getGeneric_listParserRuleCall_2()); }
	rulegeneric_list
{ after(grammarAccess.getGeneric_clauseAccess().getGeneric_listParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Generic_clause__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Generic_clause__Group__3__Impl
	rule__Generic_clause__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Generic_clause__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGeneric_clauseAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getGeneric_clauseAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Generic_clause__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Generic_clause__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Generic_clause__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGeneric_clauseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getGeneric_clauseAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Port_clause__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port_clause__Group__0__Impl
	rule__Port_clause__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Port_clause__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPort_clauseAccess().getPortKeyword_0()); }

	'port' 

{ after(grammarAccess.getPort_clauseAccess().getPortKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port_clause__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port_clause__Group__1__Impl
	rule__Port_clause__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Port_clause__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPort_clauseAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getPort_clauseAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port_clause__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port_clause__Group__2__Impl
	rule__Port_clause__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Port_clause__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPort_clauseAccess().getPort_listParserRuleCall_2()); }
	ruleport_list
{ after(grammarAccess.getPort_clauseAccess().getPort_listParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port_clause__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port_clause__Group__3__Impl
	rule__Port_clause__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Port_clause__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPort_clauseAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getPort_clauseAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port_clause__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port_clause__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Port_clause__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPort_clauseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getPort_clauseAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}













rule__VHDLPagckage__ElementsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVHDLPagckageAccess().getElementsEntity_declarationParserRuleCall_0()); }
	ruleentity_declaration{ after(grammarAccess.getVHDLPagckageAccess().getElementsEntity_declarationParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


