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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVHDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'is'", "'end'", "'generic'", "'('", "')'", "';'", "'port'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalVHDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVHDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVHDLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g"; }


     
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




    // $ANTLR start "entryRulevHDLPagckage"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:60:1: entryRulevHDLPagckage : rulevHDLPagckage EOF ;
    public final void entryRulevHDLPagckage() throws RecognitionException {
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:61:1: ( rulevHDLPagckage EOF )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:62:1: rulevHDLPagckage EOF
            {
             before(grammarAccess.getVHDLPagckageRule()); 
            pushFollow(FOLLOW_rulevHDLPagckage_in_entryRulevHDLPagckage61);
            rulevHDLPagckage();

            state._fsp--;

             after(grammarAccess.getVHDLPagckageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevHDLPagckage68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevHDLPagckage"


    // $ANTLR start "rulevHDLPagckage"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:69:1: rulevHDLPagckage : ( ( rule__VHDLPagckage__ElementsAssignment ) ) ;
    public final void rulevHDLPagckage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:73:2: ( ( ( rule__VHDLPagckage__ElementsAssignment ) ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:74:1: ( ( rule__VHDLPagckage__ElementsAssignment ) )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:74:1: ( ( rule__VHDLPagckage__ElementsAssignment ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:75:1: ( rule__VHDLPagckage__ElementsAssignment )
            {
             before(grammarAccess.getVHDLPagckageAccess().getElementsAssignment()); 
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:76:1: ( rule__VHDLPagckage__ElementsAssignment )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:76:2: rule__VHDLPagckage__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__VHDLPagckage__ElementsAssignment_in_rulevHDLPagckage94);
            rule__VHDLPagckage__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVHDLPagckageAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevHDLPagckage"


    // $ANTLR start "entryRuleentity_declaration"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:88:1: entryRuleentity_declaration : ruleentity_declaration EOF ;
    public final void entryRuleentity_declaration() throws RecognitionException {
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:89:1: ( ruleentity_declaration EOF )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:90:1: ruleentity_declaration EOF
            {
             before(grammarAccess.getEntity_declarationRule()); 
            pushFollow(FOLLOW_ruleentity_declaration_in_entryRuleentity_declaration121);
            ruleentity_declaration();

            state._fsp--;

             after(grammarAccess.getEntity_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentity_declaration128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleentity_declaration"


    // $ANTLR start "ruleentity_declaration"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:97:1: ruleentity_declaration : ( ( rule__Entity_declaration__Group__0 ) ) ;
    public final void ruleentity_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:101:2: ( ( ( rule__Entity_declaration__Group__0 ) ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:102:1: ( ( rule__Entity_declaration__Group__0 ) )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:102:1: ( ( rule__Entity_declaration__Group__0 ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:103:1: ( rule__Entity_declaration__Group__0 )
            {
             before(grammarAccess.getEntity_declarationAccess().getGroup()); 
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:104:1: ( rule__Entity_declaration__Group__0 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:104:2: rule__Entity_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Entity_declaration__Group__0_in_ruleentity_declaration154);
            rule__Entity_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntity_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleentity_declaration"


    // $ANTLR start "entryRuleentity_header"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:116:1: entryRuleentity_header : ruleentity_header EOF ;
    public final void entryRuleentity_header() throws RecognitionException {
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:117:1: ( ruleentity_header EOF )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:118:1: ruleentity_header EOF
            {
             before(grammarAccess.getEntity_headerRule()); 
            pushFollow(FOLLOW_ruleentity_header_in_entryRuleentity_header181);
            ruleentity_header();

            state._fsp--;

             after(grammarAccess.getEntity_headerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentity_header188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleentity_header"


    // $ANTLR start "ruleentity_header"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:125:1: ruleentity_header : ( ( rule__Entity_header__Group__0 ) ) ;
    public final void ruleentity_header() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:129:2: ( ( ( rule__Entity_header__Group__0 ) ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:130:1: ( ( rule__Entity_header__Group__0 ) )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:130:1: ( ( rule__Entity_header__Group__0 ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:131:1: ( rule__Entity_header__Group__0 )
            {
             before(grammarAccess.getEntity_headerAccess().getGroup()); 
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:132:1: ( rule__Entity_header__Group__0 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:132:2: rule__Entity_header__Group__0
            {
            pushFollow(FOLLOW_rule__Entity_header__Group__0_in_ruleentity_header214);
            rule__Entity_header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntity_headerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleentity_header"


    // $ANTLR start "entryRulegeneric_clause"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:144:1: entryRulegeneric_clause : rulegeneric_clause EOF ;
    public final void entryRulegeneric_clause() throws RecognitionException {
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:145:1: ( rulegeneric_clause EOF )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:146:1: rulegeneric_clause EOF
            {
             before(grammarAccess.getGeneric_clauseRule()); 
            pushFollow(FOLLOW_rulegeneric_clause_in_entryRulegeneric_clause241);
            rulegeneric_clause();

            state._fsp--;

             after(grammarAccess.getGeneric_clauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegeneric_clause248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulegeneric_clause"


    // $ANTLR start "rulegeneric_clause"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:153:1: rulegeneric_clause : ( ( rule__Generic_clause__Group__0 ) ) ;
    public final void rulegeneric_clause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:157:2: ( ( ( rule__Generic_clause__Group__0 ) ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:158:1: ( ( rule__Generic_clause__Group__0 ) )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:158:1: ( ( rule__Generic_clause__Group__0 ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:159:1: ( rule__Generic_clause__Group__0 )
            {
             before(grammarAccess.getGeneric_clauseAccess().getGroup()); 
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:160:1: ( rule__Generic_clause__Group__0 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:160:2: rule__Generic_clause__Group__0
            {
            pushFollow(FOLLOW_rule__Generic_clause__Group__0_in_rulegeneric_clause274);
            rule__Generic_clause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneric_clauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegeneric_clause"


    // $ANTLR start "entryRuleport_clause"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:172:1: entryRuleport_clause : ruleport_clause EOF ;
    public final void entryRuleport_clause() throws RecognitionException {
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:173:1: ( ruleport_clause EOF )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:174:1: ruleport_clause EOF
            {
             before(grammarAccess.getPort_clauseRule()); 
            pushFollow(FOLLOW_ruleport_clause_in_entryRuleport_clause301);
            ruleport_clause();

            state._fsp--;

             after(grammarAccess.getPort_clauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleport_clause308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleport_clause"


    // $ANTLR start "ruleport_clause"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:181:1: ruleport_clause : ( ( rule__Port_clause__Group__0 ) ) ;
    public final void ruleport_clause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:185:2: ( ( ( rule__Port_clause__Group__0 ) ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:186:1: ( ( rule__Port_clause__Group__0 ) )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:186:1: ( ( rule__Port_clause__Group__0 ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:187:1: ( rule__Port_clause__Group__0 )
            {
             before(grammarAccess.getPort_clauseAccess().getGroup()); 
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:188:1: ( rule__Port_clause__Group__0 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:188:2: rule__Port_clause__Group__0
            {
            pushFollow(FOLLOW_rule__Port_clause__Group__0_in_ruleport_clause334);
            rule__Port_clause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPort_clauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleport_clause"


    // $ANTLR start "entryRulegeneric_list"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:200:1: entryRulegeneric_list : rulegeneric_list EOF ;
    public final void entryRulegeneric_list() throws RecognitionException {
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:201:1: ( rulegeneric_list EOF )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:202:1: rulegeneric_list EOF
            {
             before(grammarAccess.getGeneric_listRule()); 
            pushFollow(FOLLOW_rulegeneric_list_in_entryRulegeneric_list361);
            rulegeneric_list();

            state._fsp--;

             after(grammarAccess.getGeneric_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegeneric_list368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulegeneric_list"


    // $ANTLR start "rulegeneric_list"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:209:1: rulegeneric_list : ( RULE_ID ) ;
    public final void rulegeneric_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:213:2: ( ( RULE_ID ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:214:1: ( RULE_ID )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:214:1: ( RULE_ID )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:215:1: RULE_ID
            {
             before(grammarAccess.getGeneric_listAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulegeneric_list394); 
             after(grammarAccess.getGeneric_listAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegeneric_list"


    // $ANTLR start "entryRuleport_list"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:228:1: entryRuleport_list : ruleport_list EOF ;
    public final void entryRuleport_list() throws RecognitionException {
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:229:1: ( ruleport_list EOF )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:230:1: ruleport_list EOF
            {
             before(grammarAccess.getPort_listRule()); 
            pushFollow(FOLLOW_ruleport_list_in_entryRuleport_list420);
            ruleport_list();

            state._fsp--;

             after(grammarAccess.getPort_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleport_list427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleport_list"


    // $ANTLR start "ruleport_list"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:237:1: ruleport_list : ( RULE_ID ) ;
    public final void ruleport_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:241:2: ( ( RULE_ID ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:242:1: ( RULE_ID )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:242:1: ( RULE_ID )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:243:1: RULE_ID
            {
             before(grammarAccess.getPort_listAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleport_list453); 
             after(grammarAccess.getPort_listAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleport_list"


    // $ANTLR start "rule__Entity_declaration__Group__0"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:258:1: rule__Entity_declaration__Group__0 : rule__Entity_declaration__Group__0__Impl rule__Entity_declaration__Group__1 ;
    public final void rule__Entity_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:262:1: ( rule__Entity_declaration__Group__0__Impl rule__Entity_declaration__Group__1 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:263:2: rule__Entity_declaration__Group__0__Impl rule__Entity_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Entity_declaration__Group__0__Impl_in_rule__Entity_declaration__Group__0486);
            rule__Entity_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity_declaration__Group__1_in_rule__Entity_declaration__Group__0489);
            rule__Entity_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_declaration__Group__0"


    // $ANTLR start "rule__Entity_declaration__Group__0__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:270:1: rule__Entity_declaration__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:274:1: ( ( 'entity' ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:275:1: ( 'entity' )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:275:1: ( 'entity' )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:276:1: 'entity'
            {
             before(grammarAccess.getEntity_declarationAccess().getEntityKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Entity_declaration__Group__0__Impl517); 
             after(grammarAccess.getEntity_declarationAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_declaration__Group__0__Impl"


    // $ANTLR start "rule__Entity_declaration__Group__1"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:289:1: rule__Entity_declaration__Group__1 : rule__Entity_declaration__Group__1__Impl rule__Entity_declaration__Group__2 ;
    public final void rule__Entity_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:293:1: ( rule__Entity_declaration__Group__1__Impl rule__Entity_declaration__Group__2 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:294:2: rule__Entity_declaration__Group__1__Impl rule__Entity_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Entity_declaration__Group__1__Impl_in_rule__Entity_declaration__Group__1548);
            rule__Entity_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity_declaration__Group__2_in_rule__Entity_declaration__Group__1551);
            rule__Entity_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_declaration__Group__1"


    // $ANTLR start "rule__Entity_declaration__Group__1__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:301:1: rule__Entity_declaration__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Entity_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:305:1: ( ( RULE_ID ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:306:1: ( RULE_ID )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:306:1: ( RULE_ID )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:307:1: RULE_ID
            {
             before(grammarAccess.getEntity_declarationAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity_declaration__Group__1__Impl578); 
             after(grammarAccess.getEntity_declarationAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_declaration__Group__1__Impl"


    // $ANTLR start "rule__Entity_declaration__Group__2"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:318:1: rule__Entity_declaration__Group__2 : rule__Entity_declaration__Group__2__Impl rule__Entity_declaration__Group__3 ;
    public final void rule__Entity_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:322:1: ( rule__Entity_declaration__Group__2__Impl rule__Entity_declaration__Group__3 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:323:2: rule__Entity_declaration__Group__2__Impl rule__Entity_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Entity_declaration__Group__2__Impl_in_rule__Entity_declaration__Group__2607);
            rule__Entity_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity_declaration__Group__3_in_rule__Entity_declaration__Group__2610);
            rule__Entity_declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_declaration__Group__2"


    // $ANTLR start "rule__Entity_declaration__Group__2__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:330:1: rule__Entity_declaration__Group__2__Impl : ( 'is' ) ;
    public final void rule__Entity_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:334:1: ( ( 'is' ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:335:1: ( 'is' )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:335:1: ( 'is' )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:336:1: 'is'
            {
             before(grammarAccess.getEntity_declarationAccess().getIsKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Entity_declaration__Group__2__Impl638); 
             after(grammarAccess.getEntity_declarationAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_declaration__Group__2__Impl"


    // $ANTLR start "rule__Entity_declaration__Group__3"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:349:1: rule__Entity_declaration__Group__3 : rule__Entity_declaration__Group__3__Impl rule__Entity_declaration__Group__4 ;
    public final void rule__Entity_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:353:1: ( rule__Entity_declaration__Group__3__Impl rule__Entity_declaration__Group__4 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:354:2: rule__Entity_declaration__Group__3__Impl rule__Entity_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Entity_declaration__Group__3__Impl_in_rule__Entity_declaration__Group__3669);
            rule__Entity_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity_declaration__Group__4_in_rule__Entity_declaration__Group__3672);
            rule__Entity_declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_declaration__Group__3"


    // $ANTLR start "rule__Entity_declaration__Group__3__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:361:1: rule__Entity_declaration__Group__3__Impl : ( ruleentity_header ) ;
    public final void rule__Entity_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:365:1: ( ( ruleentity_header ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:366:1: ( ruleentity_header )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:366:1: ( ruleentity_header )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:367:1: ruleentity_header
            {
             before(grammarAccess.getEntity_declarationAccess().getEntity_headerParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleentity_header_in_rule__Entity_declaration__Group__3__Impl699);
            ruleentity_header();

            state._fsp--;

             after(grammarAccess.getEntity_declarationAccess().getEntity_headerParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_declaration__Group__3__Impl"


    // $ANTLR start "rule__Entity_declaration__Group__4"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:378:1: rule__Entity_declaration__Group__4 : rule__Entity_declaration__Group__4__Impl ;
    public final void rule__Entity_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:382:1: ( rule__Entity_declaration__Group__4__Impl )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:383:2: rule__Entity_declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity_declaration__Group__4__Impl_in_rule__Entity_declaration__Group__4728);
            rule__Entity_declaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_declaration__Group__4"


    // $ANTLR start "rule__Entity_declaration__Group__4__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:389:1: rule__Entity_declaration__Group__4__Impl : ( 'end' ) ;
    public final void rule__Entity_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:393:1: ( ( 'end' ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:394:1: ( 'end' )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:394:1: ( 'end' )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:395:1: 'end'
            {
             before(grammarAccess.getEntity_declarationAccess().getEndKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Entity_declaration__Group__4__Impl756); 
             after(grammarAccess.getEntity_declarationAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_declaration__Group__4__Impl"


    // $ANTLR start "rule__Entity_header__Group__0"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:418:1: rule__Entity_header__Group__0 : rule__Entity_header__Group__0__Impl rule__Entity_header__Group__1 ;
    public final void rule__Entity_header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:422:1: ( rule__Entity_header__Group__0__Impl rule__Entity_header__Group__1 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:423:2: rule__Entity_header__Group__0__Impl rule__Entity_header__Group__1
            {
            pushFollow(FOLLOW_rule__Entity_header__Group__0__Impl_in_rule__Entity_header__Group__0797);
            rule__Entity_header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity_header__Group__1_in_rule__Entity_header__Group__0800);
            rule__Entity_header__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_header__Group__0"


    // $ANTLR start "rule__Entity_header__Group__0__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:430:1: rule__Entity_header__Group__0__Impl : ( ( rulegeneric_clause )? ) ;
    public final void rule__Entity_header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:434:1: ( ( ( rulegeneric_clause )? ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:435:1: ( ( rulegeneric_clause )? )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:435:1: ( ( rulegeneric_clause )? )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:436:1: ( rulegeneric_clause )?
            {
             before(grammarAccess.getEntity_headerAccess().getGeneric_clauseParserRuleCall_0()); 
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:437:1: ( rulegeneric_clause )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:437:3: rulegeneric_clause
                    {
                    pushFollow(FOLLOW_rulegeneric_clause_in_rule__Entity_header__Group__0__Impl828);
                    rulegeneric_clause();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntity_headerAccess().getGeneric_clauseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_header__Group__0__Impl"


    // $ANTLR start "rule__Entity_header__Group__1"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:447:1: rule__Entity_header__Group__1 : rule__Entity_header__Group__1__Impl ;
    public final void rule__Entity_header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:451:1: ( rule__Entity_header__Group__1__Impl )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:452:2: rule__Entity_header__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity_header__Group__1__Impl_in_rule__Entity_header__Group__1859);
            rule__Entity_header__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_header__Group__1"


    // $ANTLR start "rule__Entity_header__Group__1__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:458:1: rule__Entity_header__Group__1__Impl : ( ( ruleport_clause )? ) ;
    public final void rule__Entity_header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:462:1: ( ( ( ruleport_clause )? ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:463:1: ( ( ruleport_clause )? )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:463:1: ( ( ruleport_clause )? )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:464:1: ( ruleport_clause )?
            {
             before(grammarAccess.getEntity_headerAccess().getPort_clauseParserRuleCall_1()); 
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:465:1: ( ruleport_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:465:3: ruleport_clause
                    {
                    pushFollow(FOLLOW_ruleport_clause_in_rule__Entity_header__Group__1__Impl887);
                    ruleport_clause();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntity_headerAccess().getPort_clauseParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_header__Group__1__Impl"


    // $ANTLR start "rule__Generic_clause__Group__0"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:479:1: rule__Generic_clause__Group__0 : rule__Generic_clause__Group__0__Impl rule__Generic_clause__Group__1 ;
    public final void rule__Generic_clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:483:1: ( rule__Generic_clause__Group__0__Impl rule__Generic_clause__Group__1 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:484:2: rule__Generic_clause__Group__0__Impl rule__Generic_clause__Group__1
            {
            pushFollow(FOLLOW_rule__Generic_clause__Group__0__Impl_in_rule__Generic_clause__Group__0922);
            rule__Generic_clause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generic_clause__Group__1_in_rule__Generic_clause__Group__0925);
            rule__Generic_clause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic_clause__Group__0"


    // $ANTLR start "rule__Generic_clause__Group__0__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:491:1: rule__Generic_clause__Group__0__Impl : ( 'generic' ) ;
    public final void rule__Generic_clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:495:1: ( ( 'generic' ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:496:1: ( 'generic' )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:496:1: ( 'generic' )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:497:1: 'generic'
            {
             before(grammarAccess.getGeneric_clauseAccess().getGenericKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Generic_clause__Group__0__Impl953); 
             after(grammarAccess.getGeneric_clauseAccess().getGenericKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic_clause__Group__0__Impl"


    // $ANTLR start "rule__Generic_clause__Group__1"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:510:1: rule__Generic_clause__Group__1 : rule__Generic_clause__Group__1__Impl rule__Generic_clause__Group__2 ;
    public final void rule__Generic_clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:514:1: ( rule__Generic_clause__Group__1__Impl rule__Generic_clause__Group__2 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:515:2: rule__Generic_clause__Group__1__Impl rule__Generic_clause__Group__2
            {
            pushFollow(FOLLOW_rule__Generic_clause__Group__1__Impl_in_rule__Generic_clause__Group__1984);
            rule__Generic_clause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generic_clause__Group__2_in_rule__Generic_clause__Group__1987);
            rule__Generic_clause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic_clause__Group__1"


    // $ANTLR start "rule__Generic_clause__Group__1__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:522:1: rule__Generic_clause__Group__1__Impl : ( '(' ) ;
    public final void rule__Generic_clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:526:1: ( ( '(' ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:527:1: ( '(' )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:527:1: ( '(' )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:528:1: '('
            {
             before(grammarAccess.getGeneric_clauseAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Generic_clause__Group__1__Impl1015); 
             after(grammarAccess.getGeneric_clauseAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic_clause__Group__1__Impl"


    // $ANTLR start "rule__Generic_clause__Group__2"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:541:1: rule__Generic_clause__Group__2 : rule__Generic_clause__Group__2__Impl rule__Generic_clause__Group__3 ;
    public final void rule__Generic_clause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:545:1: ( rule__Generic_clause__Group__2__Impl rule__Generic_clause__Group__3 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:546:2: rule__Generic_clause__Group__2__Impl rule__Generic_clause__Group__3
            {
            pushFollow(FOLLOW_rule__Generic_clause__Group__2__Impl_in_rule__Generic_clause__Group__21046);
            rule__Generic_clause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generic_clause__Group__3_in_rule__Generic_clause__Group__21049);
            rule__Generic_clause__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic_clause__Group__2"


    // $ANTLR start "rule__Generic_clause__Group__2__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:553:1: rule__Generic_clause__Group__2__Impl : ( rulegeneric_list ) ;
    public final void rule__Generic_clause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:557:1: ( ( rulegeneric_list ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:558:1: ( rulegeneric_list )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:558:1: ( rulegeneric_list )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:559:1: rulegeneric_list
            {
             before(grammarAccess.getGeneric_clauseAccess().getGeneric_listParserRuleCall_2()); 
            pushFollow(FOLLOW_rulegeneric_list_in_rule__Generic_clause__Group__2__Impl1076);
            rulegeneric_list();

            state._fsp--;

             after(grammarAccess.getGeneric_clauseAccess().getGeneric_listParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic_clause__Group__2__Impl"


    // $ANTLR start "rule__Generic_clause__Group__3"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:570:1: rule__Generic_clause__Group__3 : rule__Generic_clause__Group__3__Impl rule__Generic_clause__Group__4 ;
    public final void rule__Generic_clause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:574:1: ( rule__Generic_clause__Group__3__Impl rule__Generic_clause__Group__4 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:575:2: rule__Generic_clause__Group__3__Impl rule__Generic_clause__Group__4
            {
            pushFollow(FOLLOW_rule__Generic_clause__Group__3__Impl_in_rule__Generic_clause__Group__31105);
            rule__Generic_clause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generic_clause__Group__4_in_rule__Generic_clause__Group__31108);
            rule__Generic_clause__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic_clause__Group__3"


    // $ANTLR start "rule__Generic_clause__Group__3__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:582:1: rule__Generic_clause__Group__3__Impl : ( ')' ) ;
    public final void rule__Generic_clause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:586:1: ( ( ')' ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:587:1: ( ')' )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:587:1: ( ')' )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:588:1: ')'
            {
             before(grammarAccess.getGeneric_clauseAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Generic_clause__Group__3__Impl1136); 
             after(grammarAccess.getGeneric_clauseAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic_clause__Group__3__Impl"


    // $ANTLR start "rule__Generic_clause__Group__4"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:601:1: rule__Generic_clause__Group__4 : rule__Generic_clause__Group__4__Impl ;
    public final void rule__Generic_clause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:605:1: ( rule__Generic_clause__Group__4__Impl )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:606:2: rule__Generic_clause__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Generic_clause__Group__4__Impl_in_rule__Generic_clause__Group__41167);
            rule__Generic_clause__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic_clause__Group__4"


    // $ANTLR start "rule__Generic_clause__Group__4__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:612:1: rule__Generic_clause__Group__4__Impl : ( ';' ) ;
    public final void rule__Generic_clause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:616:1: ( ( ';' ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:617:1: ( ';' )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:617:1: ( ';' )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:618:1: ';'
            {
             before(grammarAccess.getGeneric_clauseAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Generic_clause__Group__4__Impl1195); 
             after(grammarAccess.getGeneric_clauseAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic_clause__Group__4__Impl"


    // $ANTLR start "rule__Port_clause__Group__0"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:641:1: rule__Port_clause__Group__0 : rule__Port_clause__Group__0__Impl rule__Port_clause__Group__1 ;
    public final void rule__Port_clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:645:1: ( rule__Port_clause__Group__0__Impl rule__Port_clause__Group__1 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:646:2: rule__Port_clause__Group__0__Impl rule__Port_clause__Group__1
            {
            pushFollow(FOLLOW_rule__Port_clause__Group__0__Impl_in_rule__Port_clause__Group__01236);
            rule__Port_clause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port_clause__Group__1_in_rule__Port_clause__Group__01239);
            rule__Port_clause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_clause__Group__0"


    // $ANTLR start "rule__Port_clause__Group__0__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:653:1: rule__Port_clause__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port_clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:657:1: ( ( 'port' ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:658:1: ( 'port' )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:658:1: ( 'port' )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:659:1: 'port'
            {
             before(grammarAccess.getPort_clauseAccess().getPortKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Port_clause__Group__0__Impl1267); 
             after(grammarAccess.getPort_clauseAccess().getPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_clause__Group__0__Impl"


    // $ANTLR start "rule__Port_clause__Group__1"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:672:1: rule__Port_clause__Group__1 : rule__Port_clause__Group__1__Impl rule__Port_clause__Group__2 ;
    public final void rule__Port_clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:676:1: ( rule__Port_clause__Group__1__Impl rule__Port_clause__Group__2 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:677:2: rule__Port_clause__Group__1__Impl rule__Port_clause__Group__2
            {
            pushFollow(FOLLOW_rule__Port_clause__Group__1__Impl_in_rule__Port_clause__Group__11298);
            rule__Port_clause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port_clause__Group__2_in_rule__Port_clause__Group__11301);
            rule__Port_clause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_clause__Group__1"


    // $ANTLR start "rule__Port_clause__Group__1__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:684:1: rule__Port_clause__Group__1__Impl : ( '(' ) ;
    public final void rule__Port_clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:688:1: ( ( '(' ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:689:1: ( '(' )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:689:1: ( '(' )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:690:1: '('
            {
             before(grammarAccess.getPort_clauseAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Port_clause__Group__1__Impl1329); 
             after(grammarAccess.getPort_clauseAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_clause__Group__1__Impl"


    // $ANTLR start "rule__Port_clause__Group__2"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:703:1: rule__Port_clause__Group__2 : rule__Port_clause__Group__2__Impl rule__Port_clause__Group__3 ;
    public final void rule__Port_clause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:707:1: ( rule__Port_clause__Group__2__Impl rule__Port_clause__Group__3 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:708:2: rule__Port_clause__Group__2__Impl rule__Port_clause__Group__3
            {
            pushFollow(FOLLOW_rule__Port_clause__Group__2__Impl_in_rule__Port_clause__Group__21360);
            rule__Port_clause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port_clause__Group__3_in_rule__Port_clause__Group__21363);
            rule__Port_clause__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_clause__Group__2"


    // $ANTLR start "rule__Port_clause__Group__2__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:715:1: rule__Port_clause__Group__2__Impl : ( ruleport_list ) ;
    public final void rule__Port_clause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:719:1: ( ( ruleport_list ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:720:1: ( ruleport_list )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:720:1: ( ruleport_list )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:721:1: ruleport_list
            {
             before(grammarAccess.getPort_clauseAccess().getPort_listParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleport_list_in_rule__Port_clause__Group__2__Impl1390);
            ruleport_list();

            state._fsp--;

             after(grammarAccess.getPort_clauseAccess().getPort_listParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_clause__Group__2__Impl"


    // $ANTLR start "rule__Port_clause__Group__3"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:732:1: rule__Port_clause__Group__3 : rule__Port_clause__Group__3__Impl rule__Port_clause__Group__4 ;
    public final void rule__Port_clause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:736:1: ( rule__Port_clause__Group__3__Impl rule__Port_clause__Group__4 )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:737:2: rule__Port_clause__Group__3__Impl rule__Port_clause__Group__4
            {
            pushFollow(FOLLOW_rule__Port_clause__Group__3__Impl_in_rule__Port_clause__Group__31419);
            rule__Port_clause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port_clause__Group__4_in_rule__Port_clause__Group__31422);
            rule__Port_clause__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_clause__Group__3"


    // $ANTLR start "rule__Port_clause__Group__3__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:744:1: rule__Port_clause__Group__3__Impl : ( ')' ) ;
    public final void rule__Port_clause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:748:1: ( ( ')' ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:749:1: ( ')' )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:749:1: ( ')' )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:750:1: ')'
            {
             before(grammarAccess.getPort_clauseAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Port_clause__Group__3__Impl1450); 
             after(grammarAccess.getPort_clauseAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_clause__Group__3__Impl"


    // $ANTLR start "rule__Port_clause__Group__4"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:763:1: rule__Port_clause__Group__4 : rule__Port_clause__Group__4__Impl ;
    public final void rule__Port_clause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:767:1: ( rule__Port_clause__Group__4__Impl )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:768:2: rule__Port_clause__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Port_clause__Group__4__Impl_in_rule__Port_clause__Group__41481);
            rule__Port_clause__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_clause__Group__4"


    // $ANTLR start "rule__Port_clause__Group__4__Impl"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:774:1: rule__Port_clause__Group__4__Impl : ( ';' ) ;
    public final void rule__Port_clause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:778:1: ( ( ';' ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:779:1: ( ';' )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:779:1: ( ';' )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:780:1: ';'
            {
             before(grammarAccess.getPort_clauseAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Port_clause__Group__4__Impl1509); 
             after(grammarAccess.getPort_clauseAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port_clause__Group__4__Impl"


    // $ANTLR start "rule__VHDLPagckage__ElementsAssignment"
    // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:804:1: rule__VHDLPagckage__ElementsAssignment : ( ruleentity_declaration ) ;
    public final void rule__VHDLPagckage__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:808:1: ( ( ruleentity_declaration ) )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:809:1: ( ruleentity_declaration )
            {
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:809:1: ( ruleentity_declaration )
            // ../org.hepaxcodex.eVHDL.ui/src-gen/org/hepaxcodex/eVHDL/ui/contentassist/antlr/internal/InternalVHDL.g:810:1: ruleentity_declaration
            {
             before(grammarAccess.getVHDLPagckageAccess().getElementsEntity_declarationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleentity_declaration_in_rule__VHDLPagckage__ElementsAssignment1555);
            ruleentity_declaration();

            state._fsp--;

             after(grammarAccess.getVHDLPagckageAccess().getElementsEntity_declarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VHDLPagckage__ElementsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulevHDLPagckage_in_entryRulevHDLPagckage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevHDLPagckage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VHDLPagckage__ElementsAssignment_in_rulevHDLPagckage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentity_declaration_in_entryRuleentity_declaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentity_declaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity_declaration__Group__0_in_ruleentity_declaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentity_header_in_entryRuleentity_header181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentity_header188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity_header__Group__0_in_ruleentity_header214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegeneric_clause_in_entryRulegeneric_clause241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegeneric_clause248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generic_clause__Group__0_in_rulegeneric_clause274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleport_clause_in_entryRuleport_clause301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleport_clause308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port_clause__Group__0_in_ruleport_clause334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegeneric_list_in_entryRulegeneric_list361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegeneric_list368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegeneric_list394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleport_list_in_entryRuleport_list420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleport_list427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleport_list453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity_declaration__Group__0__Impl_in_rule__Entity_declaration__Group__0486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity_declaration__Group__1_in_rule__Entity_declaration__Group__0489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Entity_declaration__Group__0__Impl517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity_declaration__Group__1__Impl_in_rule__Entity_declaration__Group__1548 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Entity_declaration__Group__2_in_rule__Entity_declaration__Group__1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity_declaration__Group__1__Impl578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity_declaration__Group__2__Impl_in_rule__Entity_declaration__Group__2607 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_rule__Entity_declaration__Group__3_in_rule__Entity_declaration__Group__2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity_declaration__Group__2__Impl638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity_declaration__Group__3__Impl_in_rule__Entity_declaration__Group__3669 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Entity_declaration__Group__4_in_rule__Entity_declaration__Group__3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentity_header_in_rule__Entity_declaration__Group__3__Impl699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity_declaration__Group__4__Impl_in_rule__Entity_declaration__Group__4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity_declaration__Group__4__Impl756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity_header__Group__0__Impl_in_rule__Entity_header__Group__0797 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_rule__Entity_header__Group__1_in_rule__Entity_header__Group__0800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegeneric_clause_in_rule__Entity_header__Group__0__Impl828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity_header__Group__1__Impl_in_rule__Entity_header__Group__1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleport_clause_in_rule__Entity_header__Group__1__Impl887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generic_clause__Group__0__Impl_in_rule__Generic_clause__Group__0922 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Generic_clause__Group__1_in_rule__Generic_clause__Group__0925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Generic_clause__Group__0__Impl953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generic_clause__Group__1__Impl_in_rule__Generic_clause__Group__1984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generic_clause__Group__2_in_rule__Generic_clause__Group__1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Generic_clause__Group__1__Impl1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generic_clause__Group__2__Impl_in_rule__Generic_clause__Group__21046 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Generic_clause__Group__3_in_rule__Generic_clause__Group__21049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegeneric_list_in_rule__Generic_clause__Group__2__Impl1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generic_clause__Group__3__Impl_in_rule__Generic_clause__Group__31105 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Generic_clause__Group__4_in_rule__Generic_clause__Group__31108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Generic_clause__Group__3__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generic_clause__Group__4__Impl_in_rule__Generic_clause__Group__41167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Generic_clause__Group__4__Impl1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port_clause__Group__0__Impl_in_rule__Port_clause__Group__01236 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Port_clause__Group__1_in_rule__Port_clause__Group__01239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Port_clause__Group__0__Impl1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port_clause__Group__1__Impl_in_rule__Port_clause__Group__11298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port_clause__Group__2_in_rule__Port_clause__Group__11301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Port_clause__Group__1__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port_clause__Group__2__Impl_in_rule__Port_clause__Group__21360 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Port_clause__Group__3_in_rule__Port_clause__Group__21363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleport_list_in_rule__Port_clause__Group__2__Impl1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port_clause__Group__3__Impl_in_rule__Port_clause__Group__31419 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Port_clause__Group__4_in_rule__Port_clause__Group__31422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Port_clause__Group__3__Impl1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port_clause__Group__4__Impl_in_rule__Port_clause__Group__41481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Port_clause__Group__4__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentity_declaration_in_rule__VHDLPagckage__ElementsAssignment1555 = new BitSet(new long[]{0x0000000000000002L});

}