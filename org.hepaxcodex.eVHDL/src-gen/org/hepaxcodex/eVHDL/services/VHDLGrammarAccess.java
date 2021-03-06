/*
* generated by Xtext
*/

package org.hepaxcodex.eVHDL.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class VHDLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class VHDLPagckageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "vHDLPagckage");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsEntity_declarationParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//vHDLPagckage:
		//	elements+=entity_declaration;
		public ParserRule getRule() { return rule; }

		//elements+=entity_declaration
		public Assignment getElementsAssignment() { return cElementsAssignment; }

		//entity_declaration
		public RuleCall getElementsEntity_declarationParserRuleCall_0() { return cElementsEntity_declarationParserRuleCall_0; }
	}

	public class Entity_declarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "entity_declaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cIsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cEntity_headerParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//entity_declaration:
		//	"entity" ID "is" entity_header //		entity_declarative_part
		//	//		(
		//	//			'begin'
		//	//			entity_statment_part
		//	//		)?
		//	//s('entity')? (entity_simple_name)?
		//	"end";
		public ParserRule getRule() { return rule; }

		//"entity" ID "is" entity_header //		entity_declarative_part
		////		(
		////			'begin'
		////			entity_statment_part
		////		)?
		////s('entity')? (entity_simple_name)?
		//"end"
		public Group getGroup() { return cGroup; }

		//"entity"
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }

		//"is"
		public Keyword getIsKeyword_2() { return cIsKeyword_2; }

		//entity_header
		public RuleCall getEntity_headerParserRuleCall_3() { return cEntity_headerParserRuleCall_3; }

		////		entity_declarative_part
		////		(
		////			'begin'
		////			entity_statment_part
		////		)?
		////s('entity')? (entity_simple_name)?
		//"end"
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}

	public class Entity_headerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "entity_header");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cGeneric_clauseParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cPort_clauseParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//entity_header:
		//	generic_clause? // formal_generic_clause
		//	port_clause? // formal_port_clause
		//;
		public ParserRule getRule() { return rule; }

		//generic_clause? // formal_generic_clause
		//port_clause? // formal_port_clause
		public Group getGroup() { return cGroup; }

		//generic_clause?
		public RuleCall getGeneric_clauseParserRuleCall_0() { return cGeneric_clauseParserRuleCall_0; }

		//port_clause?
		public RuleCall getPort_clauseParserRuleCall_1() { return cPort_clauseParserRuleCall_1; }
	}

	public class Generic_clauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "generic_clause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGenericKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cGeneric_listParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//generic_clause:
		//	"generic" "(" generic_list ")" ";";
		public ParserRule getRule() { return rule; }

		//"generic" "(" generic_list ")" ";"
		public Group getGroup() { return cGroup; }

		//"generic"
		public Keyword getGenericKeyword_0() { return cGenericKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//generic_list
		public RuleCall getGeneric_listParserRuleCall_2() { return cGeneric_listParserRuleCall_2; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class Port_clauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "port_clause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cPort_listParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//port_clause:
		//	"port" "(" port_list ")" ";";
		public ParserRule getRule() { return rule; }

		//"port" "(" port_list ")" ";"
		public Group getGroup() { return cGroup; }

		//"port"
		public Keyword getPortKeyword_0() { return cPortKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//port_list
		public RuleCall getPort_listParserRuleCall_2() { return cPort_listParserRuleCall_2; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class Generic_listElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "generic_list");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//generic_list:
		//	ID;
		public ParserRule getRule() { return rule; }

		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}

	public class Port_listElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "port_list");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//port_list:
		//	ID;
		public ParserRule getRule() { return rule; }

		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private VHDLPagckageElements pVHDLPagckage;
	private Entity_declarationElements pEntity_declaration;
	private Entity_headerElements pEntity_header;
	private Generic_clauseElements pGeneric_clause;
	private Port_clauseElements pPort_clause;
	private Generic_listElements pGeneric_list;
	private Port_listElements pPort_list;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public VHDLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//vHDLPagckage:
	//	elements+=entity_declaration;
	public VHDLPagckageElements getVHDLPagckageAccess() {
		return (pVHDLPagckage != null) ? pVHDLPagckage : (pVHDLPagckage = new VHDLPagckageElements());
	}
	
	public ParserRule getVHDLPagckageRule() {
		return getVHDLPagckageAccess().getRule();
	}

	//entity_declaration:
	//	"entity" ID "is" entity_header //		entity_declarative_part
	//	//		(
	//	//			'begin'
	//	//			entity_statment_part
	//	//		)?
	//	//s('entity')? (entity_simple_name)?
	//	"end";
	public Entity_declarationElements getEntity_declarationAccess() {
		return (pEntity_declaration != null) ? pEntity_declaration : (pEntity_declaration = new Entity_declarationElements());
	}
	
	public ParserRule getEntity_declarationRule() {
		return getEntity_declarationAccess().getRule();
	}

	//entity_header:
	//	generic_clause? // formal_generic_clause
	//	port_clause? // formal_port_clause
	//;
	public Entity_headerElements getEntity_headerAccess() {
		return (pEntity_header != null) ? pEntity_header : (pEntity_header = new Entity_headerElements());
	}
	
	public ParserRule getEntity_headerRule() {
		return getEntity_headerAccess().getRule();
	}

	//generic_clause:
	//	"generic" "(" generic_list ")" ";";
	public Generic_clauseElements getGeneric_clauseAccess() {
		return (pGeneric_clause != null) ? pGeneric_clause : (pGeneric_clause = new Generic_clauseElements());
	}
	
	public ParserRule getGeneric_clauseRule() {
		return getGeneric_clauseAccess().getRule();
	}

	//port_clause:
	//	"port" "(" port_list ")" ";";
	public Port_clauseElements getPort_clauseAccess() {
		return (pPort_clause != null) ? pPort_clause : (pPort_clause = new Port_clauseElements());
	}
	
	public ParserRule getPort_clauseRule() {
		return getPort_clauseAccess().getRule();
	}

	//generic_list:
	//	ID;
	public Generic_listElements getGeneric_listAccess() {
		return (pGeneric_list != null) ? pGeneric_list : (pGeneric_list = new Generic_listElements());
	}
	
	public ParserRule getGeneric_listRule() {
		return getGeneric_listAccess().getRule();
	}

	//port_list:
	//	ID;
	public Port_listElements getPort_listAccess() {
		return (pPort_list != null) ? pPort_list : (pPort_list = new Port_listElements());
	}
	
	public ParserRule getPort_listRule() {
		return getPort_listAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
