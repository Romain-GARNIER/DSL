package arduinoML.concretesyntax.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import arduinoML.concretesyntax.services.ArduinoMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'initial state'", "'{'", "'bricks'", "'states'", "'}'", "':'", "'Actuator'", "'Sensor'", "'-'", "'<='", "'if'", "'('", "')'", "'=>'", "'is'", "'error'", "'HIGH'", "'LOW'", "'AND'", "'OR'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalArduinoMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArduinoMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArduinoMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArduinoML.g"; }



     	private ArduinoMLGrammarAccess grammarAccess;
     	
        public InternalArduinoMLParser(TokenStream input, ArduinoMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "App";	
       	}
       	
       	@Override
       	protected ArduinoMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleApp"
    // InternalArduinoML.g:68:1: entryRuleApp returns [EObject current=null] : iv_ruleApp= ruleApp EOF ;
    public final EObject entryRuleApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApp = null;


        try {
            // InternalArduinoML.g:69:2: (iv_ruleApp= ruleApp EOF )
            // InternalArduinoML.g:70:2: iv_ruleApp= ruleApp EOF
            {
             newCompositeNode(grammarAccess.getAppRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleApp=ruleApp();

            state._fsp--;

             current =iv_ruleApp; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalArduinoML.g:77:1: ruleApp returns [EObject current=null] : (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_6_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_states_9_0 = null;

        EObject lv_states_10_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:80:28: ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' ) )
            // InternalArduinoML.g:81:1: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' )
            {
            // InternalArduinoML.g:81:1: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' )
            // InternalArduinoML.g:81:3: otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
                
            // InternalArduinoML.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // InternalArduinoML.g:86:1: (lv_name_1_0= ruleEString )
            {
            // InternalArduinoML.g:86:1: (lv_name_1_0= ruleEString )
            // InternalArduinoML.g:87:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAppRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"arduinoML.concretesyntax.ArduinoML.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getAppAccess().getInitialStateKeyword_2());
                
            // InternalArduinoML.g:107:1: ( ( ruleEString ) )
            // InternalArduinoML.g:108:1: ( ruleEString )
            {
            // InternalArduinoML.g:108:1: ( ruleEString )
            // InternalArduinoML.g:109:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAppRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_5);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_4, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_5, grammarAccess.getAppAccess().getBricksKeyword_5());
                
            // InternalArduinoML.g:130:1: ( (lv_bricks_6_0= ruleBrick ) )
            // InternalArduinoML.g:131:1: (lv_bricks_6_0= ruleBrick )
            {
            // InternalArduinoML.g:131:1: (lv_bricks_6_0= ruleBrick )
            // InternalArduinoML.g:132:3: lv_bricks_6_0= ruleBrick
            {
             
            	        newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_8);
            lv_bricks_6_0=ruleBrick();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAppRule());
            	        }
                   		add(
                   			current, 
                   			"bricks",
                    		lv_bricks_6_0, 
                    		"arduinoML.concretesyntax.ArduinoML.Brick");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalArduinoML.g:148:2: ( (lv_bricks_7_0= ruleBrick ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArduinoML.g:149:1: (lv_bricks_7_0= ruleBrick )
            	    {
            	    // InternalArduinoML.g:149:1: (lv_bricks_7_0= ruleBrick )
            	    // InternalArduinoML.g:150:3: lv_bricks_7_0= ruleBrick
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_bricks_7_0=ruleBrick();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAppRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bricks",
            	            		lv_bricks_7_0, 
            	            		"arduinoML.concretesyntax.ArduinoML.Brick");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_8, grammarAccess.getAppAccess().getStatesKeyword_8());
                
            // InternalArduinoML.g:170:1: ( (lv_states_9_0= ruleState ) )
            // InternalArduinoML.g:171:1: (lv_states_9_0= ruleState )
            {
            // InternalArduinoML.g:171:1: (lv_states_9_0= ruleState )
            // InternalArduinoML.g:172:3: lv_states_9_0= ruleState
            {
             
            	        newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_9);
            lv_states_9_0=ruleState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAppRule());
            	        }
                   		add(
                   			current, 
                   			"states",
                    		lv_states_9_0, 
                    		"arduinoML.concretesyntax.ArduinoML.State");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalArduinoML.g:188:2: ( (lv_states_10_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArduinoML.g:189:1: (lv_states_10_0= ruleState )
            	    {
            	    // InternalArduinoML.g:189:1: (lv_states_10_0= ruleState )
            	    // InternalArduinoML.g:190:3: lv_states_10_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_states_10_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAppRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_10_0, 
            	            		"arduinoML.concretesyntax.ArduinoML.State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_11, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleBrick"
    // InternalArduinoML.g:218:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalArduinoML.g:219:2: (iv_ruleBrick= ruleBrick EOF )
            // InternalArduinoML.g:220:2: iv_ruleBrick= ruleBrick EOF
            {
             newCompositeNode(grammarAccess.getBrickRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBrick=ruleBrick();

            state._fsp--;

             current =iv_ruleBrick; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // InternalArduinoML.g:227:1: ruleBrick returns [EObject current=null] : ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pin_4_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:230:28: ( ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) )
            // InternalArduinoML.g:231:1: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) )
            {
            // InternalArduinoML.g:231:1: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) )
            // InternalArduinoML.g:231:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) )
            {
            // InternalArduinoML.g:231:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoML.g:232:5: this_Sensor_0= ruleSensor
                    {
                     
                            newCompositeNode(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_3);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;

                     
                            current = this_Sensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:242:5: this_Actuator_1= ruleActuator
                    {
                     
                            newCompositeNode(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_3);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;

                     
                            current = this_Actuator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalArduinoML.g:250:2: ( (lv_name_2_0= ruleEString ) )
            // InternalArduinoML.g:251:1: (lv_name_2_0= ruleEString )
            {
            // InternalArduinoML.g:251:1: (lv_name_2_0= ruleEString )
            // InternalArduinoML.g:252:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_10);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBrickRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"arduinoML.concretesyntax.ArduinoML.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_3, grammarAccess.getBrickAccess().getColonKeyword_2());
                
            // InternalArduinoML.g:272:1: ( (lv_pin_4_0= ruleEInt ) )
            // InternalArduinoML.g:273:1: (lv_pin_4_0= ruleEInt )
            {
            // InternalArduinoML.g:273:1: (lv_pin_4_0= ruleEInt )
            // InternalArduinoML.g:274:3: lv_pin_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_pin_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBrickRule());
            	        }
                   		set(
                   			current, 
                   			"pin",
                    		lv_pin_4_0, 
                    		"arduinoML.concretesyntax.ArduinoML.EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleActuator"
    // InternalArduinoML.g:298:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalArduinoML.g:299:2: (iv_ruleActuator= ruleActuator EOF )
            // InternalArduinoML.g:300:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalArduinoML.g:307:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalArduinoML.g:310:28: ( ( () otherlv_1= 'Actuator' ) )
            // InternalArduinoML.g:311:1: ( () otherlv_1= 'Actuator' )
            {
            // InternalArduinoML.g:311:1: ( () otherlv_1= 'Actuator' )
            // InternalArduinoML.g:311:2: () otherlv_1= 'Actuator'
            {
            // InternalArduinoML.g:311:2: ()
            // InternalArduinoML.g:312:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActuatorAccess().getActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
                

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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleSensor"
    // InternalArduinoML.g:329:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalArduinoML.g:330:2: (iv_ruleSensor= ruleSensor EOF )
            // InternalArduinoML.g:331:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalArduinoML.g:338:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalArduinoML.g:341:28: ( ( () otherlv_1= 'Sensor' ) )
            // InternalArduinoML.g:342:1: ( () otherlv_1= 'Sensor' )
            {
            // InternalArduinoML.g:342:1: ( () otherlv_1= 'Sensor' )
            // InternalArduinoML.g:342:2: () otherlv_1= 'Sensor'
            {
            // InternalArduinoML.g:342:2: ()
            // InternalArduinoML.g:343:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorAccess().getSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
                

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleEString"
    // InternalArduinoML.g:360:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArduinoML.g:361:2: (iv_ruleEString= ruleEString EOF )
            // InternalArduinoML.g:362:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalArduinoML.g:369:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalArduinoML.g:372:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArduinoML.g:373:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArduinoML.g:373:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduinoML.g:373:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:381:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalArduinoML.g:396:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArduinoML.g:397:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalArduinoML.g:398:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalArduinoML.g:405:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalArduinoML.g:408:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalArduinoML.g:409:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalArduinoML.g:409:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalArduinoML.g:409:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalArduinoML.g:409:2: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArduinoML.g:410:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_12); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleState"
    // InternalArduinoML.g:430:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalArduinoML.g:431:2: (iv_ruleState= ruleState EOF )
            // InternalArduinoML.g:432:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalArduinoML.g:439:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_errors_2_0= ruleSinkError ) )* ( (lv_actions_3_0= ruleAction ) ) ( (lv_actions_4_0= ruleAction ) )* ( (lv_transitions_5_0= ruleTransition ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_errors_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_actions_4_0 = null;

        EObject lv_transitions_5_0 = null;

        EObject lv_transitions_6_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:442:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_errors_2_0= ruleSinkError ) )* ( (lv_actions_3_0= ruleAction ) ) ( (lv_actions_4_0= ruleAction ) )* ( (lv_transitions_5_0= ruleTransition ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' ) )
            // InternalArduinoML.g:443:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_errors_2_0= ruleSinkError ) )* ( (lv_actions_3_0= ruleAction ) ) ( (lv_actions_4_0= ruleAction ) )* ( (lv_transitions_5_0= ruleTransition ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' )
            {
            // InternalArduinoML.g:443:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_errors_2_0= ruleSinkError ) )* ( (lv_actions_3_0= ruleAction ) ) ( (lv_actions_4_0= ruleAction ) )* ( (lv_transitions_5_0= ruleTransition ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' )
            // InternalArduinoML.g:443:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_errors_2_0= ruleSinkError ) )* ( (lv_actions_3_0= ruleAction ) ) ( (lv_actions_4_0= ruleAction ) )* ( (lv_transitions_5_0= ruleTransition ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}'
            {
            // InternalArduinoML.g:443:2: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:444:1: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:444:1: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:445:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"arduinoML.concretesyntax.ArduinoML.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalArduinoML.g:465:1: ( (lv_errors_2_0= ruleSinkError ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArduinoML.g:466:1: (lv_errors_2_0= ruleSinkError )
            	    {
            	    // InternalArduinoML.g:466:1: (lv_errors_2_0= ruleSinkError )
            	    // InternalArduinoML.g:467:3: lv_errors_2_0= ruleSinkError
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getErrorsSinkErrorParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_errors_2_0=ruleSinkError();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"errors",
            	            		lv_errors_2_0, 
            	            		"arduinoML.concretesyntax.ArduinoML.SinkError");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalArduinoML.g:483:3: ( (lv_actions_3_0= ruleAction ) )
            // InternalArduinoML.g:484:1: (lv_actions_3_0= ruleAction )
            {
            // InternalArduinoML.g:484:1: (lv_actions_3_0= ruleAction )
            // InternalArduinoML.g:485:3: lv_actions_3_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_13);
            lv_actions_3_0=ruleAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		add(
                   			current, 
                   			"actions",
                    		lv_actions_3_0, 
                    		"arduinoML.concretesyntax.ArduinoML.Action");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalArduinoML.g:501:2: ( (lv_actions_4_0= ruleAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalArduinoML.g:502:1: (lv_actions_4_0= ruleAction )
            	    {
            	    // InternalArduinoML.g:502:1: (lv_actions_4_0= ruleAction )
            	    // InternalArduinoML.g:503:3: lv_actions_4_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_actions_4_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_4_0, 
            	            		"arduinoML.concretesyntax.ArduinoML.Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalArduinoML.g:519:3: ( (lv_transitions_5_0= ruleTransition ) )
            // InternalArduinoML.g:520:1: (lv_transitions_5_0= ruleTransition )
            {
            // InternalArduinoML.g:520:1: (lv_transitions_5_0= ruleTransition )
            // InternalArduinoML.g:521:3: lv_transitions_5_0= ruleTransition
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_14);
            lv_transitions_5_0=ruleTransition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		add(
                   			current, 
                   			"transitions",
                    		lv_transitions_5_0, 
                    		"arduinoML.concretesyntax.ArduinoML.Transition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalArduinoML.g:537:2: ( (lv_transitions_6_0= ruleTransition ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArduinoML.g:538:1: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // InternalArduinoML.g:538:1: (lv_transitions_6_0= ruleTransition )
            	    // InternalArduinoML.g:539:3: lv_transitions_6_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_transitions_6_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_6_0, 
            	            		"arduinoML.concretesyntax.ArduinoML.Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAction"
    // InternalArduinoML.g:567:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalArduinoML.g:568:2: (iv_ruleAction= ruleAction EOF )
            // InternalArduinoML.g:569:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalArduinoML.g:576:1: ruleAction returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '<=' ( (lv_value_2_0= ruleSignal ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:579:28: ( ( ( ( ruleEString ) ) otherlv_1= '<=' ( (lv_value_2_0= ruleSignal ) ) ) )
            // InternalArduinoML.g:580:1: ( ( ( ruleEString ) ) otherlv_1= '<=' ( (lv_value_2_0= ruleSignal ) ) )
            {
            // InternalArduinoML.g:580:1: ( ( ( ruleEString ) ) otherlv_1= '<=' ( (lv_value_2_0= ruleSignal ) ) )
            // InternalArduinoML.g:580:2: ( ( ruleEString ) ) otherlv_1= '<=' ( (lv_value_2_0= ruleSignal ) )
            {
            // InternalArduinoML.g:580:2: ( ( ruleEString ) )
            // InternalArduinoML.g:581:1: ( ruleEString )
            {
            // InternalArduinoML.g:581:1: ( ruleEString )
            // InternalArduinoML.g:582:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_15);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLessThanSignEqualsSignKeyword_1());
                
            // InternalArduinoML.g:599:1: ( (lv_value_2_0= ruleSignal ) )
            // InternalArduinoML.g:600:1: (lv_value_2_0= ruleSignal )
            {
            // InternalArduinoML.g:600:1: (lv_value_2_0= ruleSignal )
            // InternalArduinoML.g:601:3: lv_value_2_0= ruleSignal
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleSignal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"arduinoML.concretesyntax.ArduinoML.Signal");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalArduinoML.g:625:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalArduinoML.g:626:2: (iv_ruleTransition= ruleTransition EOF )
            // InternalArduinoML.g:627:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalArduinoML.g:634:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_basecondition_2_0 = null;

        EObject lv_booleancondition_4_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:637:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' ( ( ruleEString ) ) ) )
            // InternalArduinoML.g:638:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' ( ( ruleEString ) ) )
            {
            // InternalArduinoML.g:638:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' ( ( ruleEString ) ) )
            // InternalArduinoML.g:638:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_1());
                
            // InternalArduinoML.g:646:1: ( (lv_basecondition_2_0= ruleBaseCondition ) )
            // InternalArduinoML.g:647:1: (lv_basecondition_2_0= ruleBaseCondition )
            {
            // InternalArduinoML.g:647:1: (lv_basecondition_2_0= ruleBaseCondition )
            // InternalArduinoML.g:648:3: lv_basecondition_2_0= ruleBaseCondition
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getBaseconditionBaseConditionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
            lv_basecondition_2_0=ruleBaseCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"basecondition",
                    		lv_basecondition_2_0, 
                    		"arduinoML.concretesyntax.ArduinoML.BaseCondition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_19); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_3());
                
            // InternalArduinoML.g:668:1: ( (lv_booleancondition_4_0= ruleBooleanCondition ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=30 && LA9_0<=31)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArduinoML.g:669:1: (lv_booleancondition_4_0= ruleBooleanCondition )
            	    {
            	    // InternalArduinoML.g:669:1: (lv_booleancondition_4_0= ruleBooleanCondition )
            	    // InternalArduinoML.g:670:3: lv_booleancondition_4_0= ruleBooleanCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransitionAccess().getBooleanconditionBooleanConditionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_booleancondition_4_0=ruleBooleanCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"booleancondition",
            	            		lv_booleancondition_4_0, 
            	            		"arduinoML.concretesyntax.ArduinoML.BooleanCondition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_5());
                
            // InternalArduinoML.g:690:1: ( ( ruleEString ) )
            // InternalArduinoML.g:691:1: ( ruleEString )
            {
            // InternalArduinoML.g:691:1: ( ruleEString )
            // InternalArduinoML.g:692:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleBaseCondition"
    // InternalArduinoML.g:713:1: entryRuleBaseCondition returns [EObject current=null] : iv_ruleBaseCondition= ruleBaseCondition EOF ;
    public final EObject entryRuleBaseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseCondition = null;


        try {
            // InternalArduinoML.g:714:2: (iv_ruleBaseCondition= ruleBaseCondition EOF )
            // InternalArduinoML.g:715:2: iv_ruleBaseCondition= ruleBaseCondition EOF
            {
             newCompositeNode(grammarAccess.getBaseConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBaseCondition=ruleBaseCondition();

            state._fsp--;

             current =iv_ruleBaseCondition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBaseCondition"


    // $ANTLR start "ruleBaseCondition"
    // InternalArduinoML.g:722:1: ruleBaseCondition returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleSignal ) ) ) ;
    public final EObject ruleBaseCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:725:28: ( ( ( ( ruleEString ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleSignal ) ) ) )
            // InternalArduinoML.g:726:1: ( ( ( ruleEString ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleSignal ) ) )
            {
            // InternalArduinoML.g:726:1: ( ( ( ruleEString ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleSignal ) ) )
            // InternalArduinoML.g:726:2: ( ( ruleEString ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleSignal ) )
            {
            // InternalArduinoML.g:726:2: ( ( ruleEString ) )
            // InternalArduinoML.g:727:1: ( ruleEString )
            {
            // InternalArduinoML.g:727:1: ( ruleEString )
            // InternalArduinoML.g:728:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBaseConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBaseConditionAccess().getSensorSensorCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_20);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getBaseConditionAccess().getIsKeyword_1());
                
            // InternalArduinoML.g:745:1: ( (lv_value_2_0= ruleSignal ) )
            // InternalArduinoML.g:746:1: (lv_value_2_0= ruleSignal )
            {
            // InternalArduinoML.g:746:1: (lv_value_2_0= ruleSignal )
            // InternalArduinoML.g:747:3: lv_value_2_0= ruleSignal
            {
             
            	        newCompositeNode(grammarAccess.getBaseConditionAccess().getValueSignalEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleSignal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseConditionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"arduinoML.concretesyntax.ArduinoML.Signal");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleBaseCondition"


    // $ANTLR start "entryRuleBooleanCondition"
    // InternalArduinoML.g:771:1: entryRuleBooleanCondition returns [EObject current=null] : iv_ruleBooleanCondition= ruleBooleanCondition EOF ;
    public final EObject entryRuleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanCondition = null;


        try {
            // InternalArduinoML.g:772:2: (iv_ruleBooleanCondition= ruleBooleanCondition EOF )
            // InternalArduinoML.g:773:2: iv_ruleBooleanCondition= ruleBooleanCondition EOF
            {
             newCompositeNode(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanCondition=ruleBooleanCondition();

            state._fsp--;

             current =iv_ruleBooleanCondition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // InternalArduinoML.g:780:1: ruleBooleanCondition returns [EObject current=null] : ( ( (lv_operator_0_0= ruleOperator ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleSignal ) ) otherlv_5= ')' ) ;
    public final EObject ruleBooleanCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_operator_0_0 = null;

        Enumerator lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:783:28: ( ( ( (lv_operator_0_0= ruleOperator ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleSignal ) ) otherlv_5= ')' ) )
            // InternalArduinoML.g:784:1: ( ( (lv_operator_0_0= ruleOperator ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleSignal ) ) otherlv_5= ')' )
            {
            // InternalArduinoML.g:784:1: ( ( (lv_operator_0_0= ruleOperator ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleSignal ) ) otherlv_5= ')' )
            // InternalArduinoML.g:784:2: ( (lv_operator_0_0= ruleOperator ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= 'is' ( (lv_value_4_0= ruleSignal ) ) otherlv_5= ')'
            {
            // InternalArduinoML.g:784:2: ( (lv_operator_0_0= ruleOperator ) )
            // InternalArduinoML.g:785:1: (lv_operator_0_0= ruleOperator )
            {
            // InternalArduinoML.g:785:1: (lv_operator_0_0= ruleOperator )
            // InternalArduinoML.g:786:3: lv_operator_0_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getOperatorOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_operator_0_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"arduinoML.concretesyntax.ArduinoML.Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanConditionAccess().getLeftParenthesisKeyword_1());
                
            // InternalArduinoML.g:806:1: ( ( ruleEString ) )
            // InternalArduinoML.g:807:1: ( ruleEString )
            {
            // InternalArduinoML.g:807:1: ( ruleEString )
            // InternalArduinoML.g:808:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getSensorSensorCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_20);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_3, grammarAccess.getBooleanConditionAccess().getIsKeyword_3());
                
            // InternalArduinoML.g:825:1: ( (lv_value_4_0= ruleSignal ) )
            // InternalArduinoML.g:826:1: (lv_value_4_0= ruleSignal )
            {
            // InternalArduinoML.g:826:1: (lv_value_4_0= ruleSignal )
            // InternalArduinoML.g:827:3: lv_value_4_0= ruleSignal
            {
             
            	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getValueSignalEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
            lv_value_4_0=ruleSignal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"arduinoML.concretesyntax.ArduinoML.Signal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getBooleanConditionAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleSinkError"
    // InternalArduinoML.g:855:1: entryRuleSinkError returns [EObject current=null] : iv_ruleSinkError= ruleSinkError EOF ;
    public final EObject entryRuleSinkError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinkError = null;


        try {
            // InternalArduinoML.g:856:2: (iv_ruleSinkError= ruleSinkError EOF )
            // InternalArduinoML.g:857:2: iv_ruleSinkError= ruleSinkError EOF
            {
             newCompositeNode(grammarAccess.getSinkErrorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSinkError=ruleSinkError();

            state._fsp--;

             current =iv_ruleSinkError; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSinkError"


    // $ANTLR start "ruleSinkError"
    // InternalArduinoML.g:864:1: ruleSinkError returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' otherlv_6= 'error' ( (lv_value_7_0= ruleEInt ) ) ) ;
    public final EObject ruleSinkError() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_basecondition_2_0 = null;

        EObject lv_booleancondition_4_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:867:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' otherlv_6= 'error' ( (lv_value_7_0= ruleEInt ) ) ) )
            // InternalArduinoML.g:868:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' otherlv_6= 'error' ( (lv_value_7_0= ruleEInt ) ) )
            {
            // InternalArduinoML.g:868:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' otherlv_6= 'error' ( (lv_value_7_0= ruleEInt ) ) )
            // InternalArduinoML.g:868:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' otherlv_6= 'error' ( (lv_value_7_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getSinkErrorAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getSinkErrorAccess().getLeftParenthesisKeyword_1());
                
            // InternalArduinoML.g:876:1: ( (lv_basecondition_2_0= ruleBaseCondition ) )
            // InternalArduinoML.g:877:1: (lv_basecondition_2_0= ruleBaseCondition )
            {
            // InternalArduinoML.g:877:1: (lv_basecondition_2_0= ruleBaseCondition )
            // InternalArduinoML.g:878:3: lv_basecondition_2_0= ruleBaseCondition
            {
             
            	        newCompositeNode(grammarAccess.getSinkErrorAccess().getBaseconditionBaseConditionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
            lv_basecondition_2_0=ruleBaseCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSinkErrorRule());
            	        }
                   		set(
                   			current, 
                   			"basecondition",
                    		lv_basecondition_2_0, 
                    		"arduinoML.concretesyntax.ArduinoML.BaseCondition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_19); 

                	newLeafNode(otherlv_3, grammarAccess.getSinkErrorAccess().getRightParenthesisKeyword_3());
                
            // InternalArduinoML.g:898:1: ( (lv_booleancondition_4_0= ruleBooleanCondition ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=30 && LA10_0<=31)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArduinoML.g:899:1: (lv_booleancondition_4_0= ruleBooleanCondition )
            	    {
            	    // InternalArduinoML.g:899:1: (lv_booleancondition_4_0= ruleBooleanCondition )
            	    // InternalArduinoML.g:900:3: lv_booleancondition_4_0= ruleBooleanCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSinkErrorAccess().getBooleanconditionBooleanConditionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_booleancondition_4_0=ruleBooleanCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSinkErrorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"booleancondition",
            	            		lv_booleancondition_4_0, 
            	            		"arduinoML.concretesyntax.ArduinoML.BooleanCondition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_21); 

                	newLeafNode(otherlv_5, grammarAccess.getSinkErrorAccess().getEqualsSignGreaterThanSignKeyword_5());
                
            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_6, grammarAccess.getSinkErrorAccess().getErrorKeyword_6());
                
            // InternalArduinoML.g:924:1: ( (lv_value_7_0= ruleEInt ) )
            // InternalArduinoML.g:925:1: (lv_value_7_0= ruleEInt )
            {
            // InternalArduinoML.g:925:1: (lv_value_7_0= ruleEInt )
            // InternalArduinoML.g:926:3: lv_value_7_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSinkErrorAccess().getValueEIntParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_7_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSinkErrorRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_7_0, 
                    		"arduinoML.concretesyntax.ArduinoML.EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSinkError"


    // $ANTLR start "ruleSignal"
    // InternalArduinoML.g:950:1: ruleSignal returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSignal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalArduinoML.g:952:28: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalArduinoML.g:953:1: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalArduinoML.g:953:1: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalArduinoML.g:953:2: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalArduinoML.g:953:2: (enumLiteral_0= 'HIGH' )
                    // InternalArduinoML.g:953:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:959:6: (enumLiteral_1= 'LOW' )
                    {
                    // InternalArduinoML.g:959:6: (enumLiteral_1= 'LOW' )
                    // InternalArduinoML.g:959:8: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSignal"


    // $ANTLR start "ruleOperator"
    // InternalArduinoML.g:969:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalArduinoML.g:971:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalArduinoML.g:972:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalArduinoML.g:972:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalArduinoML.g:972:2: (enumLiteral_0= 'AND' )
                    {
                    // InternalArduinoML.g:972:2: (enumLiteral_0= 'AND' )
                    // InternalArduinoML.g:972:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:978:6: (enumLiteral_1= 'OR' )
                    {
                    // InternalArduinoML.g:978:6: (enumLiteral_1= 'OR' )
                    // InternalArduinoML.g:978:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C8000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000410030L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C2000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    }


}