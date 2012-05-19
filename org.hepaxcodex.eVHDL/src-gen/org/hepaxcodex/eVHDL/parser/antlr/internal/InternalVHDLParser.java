package org.hepaxcodex.eVHDL.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.hepaxcodex.eVHDL.services.VHDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVHDLParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g"; }



     	private VHDLGrammarAccess grammarAccess;
     	
        public InternalVHDLParser(TokenStream input, VHDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "vHDLPagckage";	
       	}
       	
       	@Override
       	protected VHDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulevHDLPagckage"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:67:1: entryRulevHDLPagckage returns [EObject current=null] : iv_rulevHDLPagckage= rulevHDLPagckage EOF ;
    public final EObject entryRulevHDLPagckage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevHDLPagckage = null;


        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:68:2: (iv_rulevHDLPagckage= rulevHDLPagckage EOF )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:69:2: iv_rulevHDLPagckage= rulevHDLPagckage EOF
            {
             newCompositeNode(grammarAccess.getVHDLPagckageRule()); 
            pushFollow(FOLLOW_rulevHDLPagckage_in_entryRulevHDLPagckage75);
            iv_rulevHDLPagckage=rulevHDLPagckage();

            state._fsp--;

             current =iv_rulevHDLPagckage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevHDLPagckage85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevHDLPagckage"


    // $ANTLR start "rulevHDLPagckage"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:76:1: rulevHDLPagckage returns [EObject current=null] : ( (lv_elements_0_0= ruleentity_declaration ) ) ;
    public final EObject rulevHDLPagckage() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:79:28: ( ( (lv_elements_0_0= ruleentity_declaration ) ) )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:80:1: ( (lv_elements_0_0= ruleentity_declaration ) )
            {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:80:1: ( (lv_elements_0_0= ruleentity_declaration ) )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:81:1: (lv_elements_0_0= ruleentity_declaration )
            {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:81:1: (lv_elements_0_0= ruleentity_declaration )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:82:3: lv_elements_0_0= ruleentity_declaration
            {
             
            	        newCompositeNode(grammarAccess.getVHDLPagckageAccess().getElementsEntity_declarationParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleentity_declaration_in_rulevHDLPagckage130);
            lv_elements_0_0=ruleentity_declaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVHDLPagckageRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_0_0, 
                    		"entity_declaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevHDLPagckage"


    // $ANTLR start "entryRuleentity_declaration"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:106:1: entryRuleentity_declaration returns [String current=null] : iv_ruleentity_declaration= ruleentity_declaration EOF ;
    public final String entryRuleentity_declaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleentity_declaration = null;


        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:107:2: (iv_ruleentity_declaration= ruleentity_declaration EOF )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:108:2: iv_ruleentity_declaration= ruleentity_declaration EOF
            {
             newCompositeNode(grammarAccess.getEntity_declarationRule()); 
            pushFollow(FOLLOW_ruleentity_declaration_in_entryRuleentity_declaration166);
            iv_ruleentity_declaration=ruleentity_declaration();

            state._fsp--;

             current =iv_ruleentity_declaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentity_declaration177); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleentity_declaration"


    // $ANTLR start "ruleentity_declaration"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:115:1: ruleentity_declaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'entity' this_ID_1= RULE_ID kw= 'is' this_entity_header_3= ruleentity_header kw= 'end' ) ;
    public final AntlrDatatypeRuleToken ruleentity_declaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_entity_header_3 = null;


         enterRule(); 
            
        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:118:28: ( (kw= 'entity' this_ID_1= RULE_ID kw= 'is' this_entity_header_3= ruleentity_header kw= 'end' ) )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:119:1: (kw= 'entity' this_ID_1= RULE_ID kw= 'is' this_entity_header_3= ruleentity_header kw= 'end' )
            {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:119:1: (kw= 'entity' this_ID_1= RULE_ID kw= 'is' this_entity_header_3= ruleentity_header kw= 'end' )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:120:2: kw= 'entity' this_ID_1= RULE_ID kw= 'is' this_entity_header_3= ruleentity_header kw= 'end'
            {
            kw=(Token)match(input,11,FOLLOW_11_in_ruleentity_declaration215); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEntity_declarationAccess().getEntityKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleentity_declaration230); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getEntity_declarationAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleentity_declaration248); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEntity_declarationAccess().getIsKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getEntity_declarationAccess().getEntity_headerParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleentity_header_in_ruleentity_declaration270);
            this_entity_header_3=ruleentity_header();

            state._fsp--;


            		current.merge(this_entity_header_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleentity_declaration288); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEntity_declarationAccess().getEndKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleentity_declaration"


    // $ANTLR start "entryRuleentity_header"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:163:1: entryRuleentity_header returns [String current=null] : iv_ruleentity_header= ruleentity_header EOF ;
    public final String entryRuleentity_header() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleentity_header = null;


        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:164:2: (iv_ruleentity_header= ruleentity_header EOF )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:165:2: iv_ruleentity_header= ruleentity_header EOF
            {
             newCompositeNode(grammarAccess.getEntity_headerRule()); 
            pushFollow(FOLLOW_ruleentity_header_in_entryRuleentity_header329);
            iv_ruleentity_header=ruleentity_header();

            state._fsp--;

             current =iv_ruleentity_header.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentity_header340); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleentity_header"


    // $ANTLR start "ruleentity_header"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:172:1: ruleentity_header returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_generic_clause_0= rulegeneric_clause )? (this_port_clause_1= ruleport_clause )? ) ;
    public final AntlrDatatypeRuleToken ruleentity_header() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_generic_clause_0 = null;

        AntlrDatatypeRuleToken this_port_clause_1 = null;


         enterRule(); 
            
        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:175:28: ( ( (this_generic_clause_0= rulegeneric_clause )? (this_port_clause_1= ruleport_clause )? ) )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:176:1: ( (this_generic_clause_0= rulegeneric_clause )? (this_port_clause_1= ruleport_clause )? )
            {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:176:1: ( (this_generic_clause_0= rulegeneric_clause )? (this_port_clause_1= ruleport_clause )? )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:176:2: (this_generic_clause_0= rulegeneric_clause )? (this_port_clause_1= ruleport_clause )?
            {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:176:2: (this_generic_clause_0= rulegeneric_clause )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:177:5: this_generic_clause_0= rulegeneric_clause
                    {
                     
                            newCompositeNode(grammarAccess.getEntity_headerAccess().getGeneric_clauseParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulegeneric_clause_in_ruleentity_header388);
                    this_generic_clause_0=rulegeneric_clause();

                    state._fsp--;


                    		current.merge(this_generic_clause_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:187:3: (this_port_clause_1= ruleport_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:188:5: this_port_clause_1= ruleport_clause
                    {
                     
                            newCompositeNode(grammarAccess.getEntity_headerAccess().getPort_clauseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleport_clause_in_ruleentity_header418);
                    this_port_clause_1=ruleport_clause();

                    state._fsp--;


                    		current.merge(this_port_clause_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleentity_header"


    // $ANTLR start "entryRulegeneric_clause"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:206:1: entryRulegeneric_clause returns [String current=null] : iv_rulegeneric_clause= rulegeneric_clause EOF ;
    public final String entryRulegeneric_clause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegeneric_clause = null;


        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:207:2: (iv_rulegeneric_clause= rulegeneric_clause EOF )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:208:2: iv_rulegeneric_clause= rulegeneric_clause EOF
            {
             newCompositeNode(grammarAccess.getGeneric_clauseRule()); 
            pushFollow(FOLLOW_rulegeneric_clause_in_entryRulegeneric_clause466);
            iv_rulegeneric_clause=rulegeneric_clause();

            state._fsp--;

             current =iv_rulegeneric_clause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegeneric_clause477); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegeneric_clause"


    // $ANTLR start "rulegeneric_clause"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:215:1: rulegeneric_clause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'generic' kw= '(' this_generic_list_2= rulegeneric_list kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulegeneric_clause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_generic_list_2 = null;


         enterRule(); 
            
        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:218:28: ( (kw= 'generic' kw= '(' this_generic_list_2= rulegeneric_list kw= ')' kw= ';' ) )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:219:1: (kw= 'generic' kw= '(' this_generic_list_2= rulegeneric_list kw= ')' kw= ';' )
            {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:219:1: (kw= 'generic' kw= '(' this_generic_list_2= rulegeneric_list kw= ')' kw= ';' )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:220:2: kw= 'generic' kw= '(' this_generic_list_2= rulegeneric_list kw= ')' kw= ';'
            {
            kw=(Token)match(input,14,FOLLOW_14_in_rulegeneric_clause515); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGeneric_clauseAccess().getGenericKeyword_0()); 
                
            kw=(Token)match(input,15,FOLLOW_15_in_rulegeneric_clause528); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGeneric_clauseAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getGeneric_clauseAccess().getGeneric_listParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulegeneric_list_in_rulegeneric_clause550);
            this_generic_list_2=rulegeneric_list();

            state._fsp--;


            		current.merge(this_generic_list_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,16,FOLLOW_16_in_rulegeneric_clause568); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGeneric_clauseAccess().getRightParenthesisKeyword_3()); 
                
            kw=(Token)match(input,17,FOLLOW_17_in_rulegeneric_clause581); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGeneric_clauseAccess().getSemicolonKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegeneric_clause"


    // $ANTLR start "entryRuleport_clause"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:262:1: entryRuleport_clause returns [String current=null] : iv_ruleport_clause= ruleport_clause EOF ;
    public final String entryRuleport_clause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleport_clause = null;


        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:263:2: (iv_ruleport_clause= ruleport_clause EOF )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:264:2: iv_ruleport_clause= ruleport_clause EOF
            {
             newCompositeNode(grammarAccess.getPort_clauseRule()); 
            pushFollow(FOLLOW_ruleport_clause_in_entryRuleport_clause622);
            iv_ruleport_clause=ruleport_clause();

            state._fsp--;

             current =iv_ruleport_clause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleport_clause633); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleport_clause"


    // $ANTLR start "ruleport_clause"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:271:1: ruleport_clause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'port' kw= '(' this_port_list_2= ruleport_list kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleport_clause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_port_list_2 = null;


         enterRule(); 
            
        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:274:28: ( (kw= 'port' kw= '(' this_port_list_2= ruleport_list kw= ')' kw= ';' ) )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:275:1: (kw= 'port' kw= '(' this_port_list_2= ruleport_list kw= ')' kw= ';' )
            {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:275:1: (kw= 'port' kw= '(' this_port_list_2= ruleport_list kw= ')' kw= ';' )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:276:2: kw= 'port' kw= '(' this_port_list_2= ruleport_list kw= ')' kw= ';'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleport_clause671); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPort_clauseAccess().getPortKeyword_0()); 
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleport_clause684); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPort_clauseAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getPort_clauseAccess().getPort_listParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleport_list_in_ruleport_clause706);
            this_port_list_2=ruleport_list();

            state._fsp--;


            		current.merge(this_port_list_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleport_clause724); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPort_clauseAccess().getRightParenthesisKeyword_3()); 
                
            kw=(Token)match(input,17,FOLLOW_17_in_ruleport_clause737); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPort_clauseAccess().getSemicolonKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleport_clause"


    // $ANTLR start "entryRulegeneric_list"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:318:1: entryRulegeneric_list returns [String current=null] : iv_rulegeneric_list= rulegeneric_list EOF ;
    public final String entryRulegeneric_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegeneric_list = null;


        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:319:2: (iv_rulegeneric_list= rulegeneric_list EOF )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:320:2: iv_rulegeneric_list= rulegeneric_list EOF
            {
             newCompositeNode(grammarAccess.getGeneric_listRule()); 
            pushFollow(FOLLOW_rulegeneric_list_in_entryRulegeneric_list778);
            iv_rulegeneric_list=rulegeneric_list();

            state._fsp--;

             current =iv_rulegeneric_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegeneric_list789); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegeneric_list"


    // $ANTLR start "rulegeneric_list"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:327:1: rulegeneric_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulegeneric_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:330:28: (this_ID_0= RULE_ID )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:331:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulegeneric_list828); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getGeneric_listAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegeneric_list"


    // $ANTLR start "entryRuleport_list"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:346:1: entryRuleport_list returns [String current=null] : iv_ruleport_list= ruleport_list EOF ;
    public final String entryRuleport_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleport_list = null;


        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:347:2: (iv_ruleport_list= ruleport_list EOF )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:348:2: iv_ruleport_list= ruleport_list EOF
            {
             newCompositeNode(grammarAccess.getPort_listRule()); 
            pushFollow(FOLLOW_ruleport_list_in_entryRuleport_list873);
            iv_ruleport_list=ruleport_list();

            state._fsp--;

             current =iv_ruleport_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleport_list884); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleport_list"


    // $ANTLR start "ruleport_list"
    // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:355:1: ruleport_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleport_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:358:28: (this_ID_0= RULE_ID )
            // ../org.hepaxcodex.eVHDL/src-gen/org/hepaxcodex/eVHDL/parser/antlr/internal/InternalVHDL.g:359:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleport_list923); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPort_listAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleport_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulevHDLPagckage_in_entryRulevHDLPagckage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevHDLPagckage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentity_declaration_in_rulevHDLPagckage130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentity_declaration_in_entryRuleentity_declaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentity_declaration177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleentity_declaration215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleentity_declaration230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleentity_declaration248 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_ruleentity_header_in_ruleentity_declaration270 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleentity_declaration288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentity_header_in_entryRuleentity_header329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentity_header340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegeneric_clause_in_ruleentity_header388 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleport_clause_in_ruleentity_header418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegeneric_clause_in_entryRulegeneric_clause466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegeneric_clause477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulegeneric_clause515 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulegeneric_clause528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulegeneric_list_in_rulegeneric_clause550 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulegeneric_clause568 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulegeneric_clause581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleport_clause_in_entryRuleport_clause622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleport_clause633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleport_clause671 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleport_clause684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleport_list_in_ruleport_clause706 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleport_clause724 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleport_clause737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegeneric_list_in_entryRulegeneric_list778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegeneric_list789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegeneric_list828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleport_list_in_entryRuleport_list873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleport_list884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleport_list923 = new BitSet(new long[]{0x0000000000000002L});

}