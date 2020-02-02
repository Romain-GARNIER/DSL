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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'initial state'", "'{'", "'bricks'", "'states'", "'}'", "':'", "'Actuator'", "'Sensor'", "'-'", "'='", "'if'", "'('", "')'", "'=>'", "'error'", "'HIGH'", "'LOW'", "'AND'", "'OR'", "'>'", "'<'", "'=='", "'>='", "'<='", "'analog'", "'digital'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    // InternalArduinoML.g:227:1: ruleBrick returns [EObject current=null] : ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;

        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_pin_5_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:230:28: ( ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) ) )
            // InternalArduinoML.g:231:1: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) )
            {
            // InternalArduinoML.g:231:1: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) )
            // InternalArduinoML.g:231:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) )
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
                        
                    pushFollow(FollowSets000.FOLLOW_10);
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
                        
                    pushFollow(FollowSets000.FOLLOW_10);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;

                     
                            current = this_Actuator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalArduinoML.g:250:2: ( (lv_type_2_0= ruleType ) )
            // InternalArduinoML.g:251:1: (lv_type_2_0= ruleType )
            {
            // InternalArduinoML.g:251:1: (lv_type_2_0= ruleType )
            // InternalArduinoML.g:252:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getBrickAccess().getTypeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBrickRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"arduinoML.concretesyntax.ArduinoML.Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalArduinoML.g:268:2: ( (lv_name_3_0= ruleEString ) )
            // InternalArduinoML.g:269:1: (lv_name_3_0= ruleEString )
            {
            // InternalArduinoML.g:269:1: (lv_name_3_0= ruleEString )
            // InternalArduinoML.g:270:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_11);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBrickRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"arduinoML.concretesyntax.ArduinoML.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_12); 

                	newLeafNode(otherlv_4, grammarAccess.getBrickAccess().getColonKeyword_3());
                
            // InternalArduinoML.g:290:1: ( (lv_pin_5_0= ruleEInt ) )
            // InternalArduinoML.g:291:1: (lv_pin_5_0= ruleEInt )
            {
            // InternalArduinoML.g:291:1: (lv_pin_5_0= ruleEInt )
            // InternalArduinoML.g:292:3: lv_pin_5_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_pin_5_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBrickRule());
            	        }
                   		set(
                   			current, 
                   			"pin",
                    		lv_pin_5_0, 
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
    // InternalArduinoML.g:316:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalArduinoML.g:317:2: (iv_ruleActuator= ruleActuator EOF )
            // InternalArduinoML.g:318:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalArduinoML.g:325:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalArduinoML.g:328:28: ( ( () otherlv_1= 'Actuator' ) )
            // InternalArduinoML.g:329:1: ( () otherlv_1= 'Actuator' )
            {
            // InternalArduinoML.g:329:1: ( () otherlv_1= 'Actuator' )
            // InternalArduinoML.g:329:2: () otherlv_1= 'Actuator'
            {
            // InternalArduinoML.g:329:2: ()
            // InternalArduinoML.g:330:5: 
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
    // InternalArduinoML.g:347:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalArduinoML.g:348:2: (iv_ruleSensor= ruleSensor EOF )
            // InternalArduinoML.g:349:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalArduinoML.g:356:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalArduinoML.g:359:28: ( ( () otherlv_1= 'Sensor' ) )
            // InternalArduinoML.g:360:1: ( () otherlv_1= 'Sensor' )
            {
            // InternalArduinoML.g:360:1: ( () otherlv_1= 'Sensor' )
            // InternalArduinoML.g:360:2: () otherlv_1= 'Sensor'
            {
            // InternalArduinoML.g:360:2: ()
            // InternalArduinoML.g:361:5: 
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
    // InternalArduinoML.g:378:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArduinoML.g:379:2: (iv_ruleEString= ruleEString EOF )
            // InternalArduinoML.g:380:2: iv_ruleEString= ruleEString EOF
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
    // InternalArduinoML.g:387:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalArduinoML.g:390:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArduinoML.g:391:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArduinoML.g:391:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalArduinoML.g:391:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:399:10: this_ID_1= RULE_ID
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
    // InternalArduinoML.g:414:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArduinoML.g:415:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalArduinoML.g:416:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalArduinoML.g:423:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalArduinoML.g:426:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalArduinoML.g:427:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalArduinoML.g:427:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalArduinoML.g:427:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalArduinoML.g:427:2: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArduinoML.g:428:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_13); 

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
    // InternalArduinoML.g:448:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalArduinoML.g:449:2: (iv_ruleState= ruleState EOF )
            // InternalArduinoML.g:450:2: iv_ruleState= ruleState EOF
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
    // InternalArduinoML.g:457:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_errors_4_0= ruleSinkError ) )* ( (lv_transitions_5_0= ruleTransition ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_errors_4_0 = null;

        EObject lv_transitions_5_0 = null;

        EObject lv_transitions_6_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:460:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_errors_4_0= ruleSinkError ) )* ( (lv_transitions_5_0= ruleTransition ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' ) )
            // InternalArduinoML.g:461:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_errors_4_0= ruleSinkError ) )* ( (lv_transitions_5_0= ruleTransition ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' )
            {
            // InternalArduinoML.g:461:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_errors_4_0= ruleSinkError ) )* ( (lv_transitions_5_0= ruleTransition ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}' )
            // InternalArduinoML.g:461:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_errors_4_0= ruleSinkError ) )* ( (lv_transitions_5_0= ruleTransition ) ) ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= '}'
            {
            // InternalArduinoML.g:461:2: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:462:1: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:462:1: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:463:3: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalArduinoML.g:483:1: ( (lv_actions_2_0= ruleAction ) )
            // InternalArduinoML.g:484:1: (lv_actions_2_0= ruleAction )
            {
            // InternalArduinoML.g:484:1: (lv_actions_2_0= ruleAction )
            // InternalArduinoML.g:485:3: lv_actions_2_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_14);
            lv_actions_2_0=ruleAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		add(
                   			current, 
                   			"actions",
                    		lv_actions_2_0, 
                    		"arduinoML.concretesyntax.ArduinoML.Action");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalArduinoML.g:501:2: ( (lv_actions_3_0= ruleAction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArduinoML.g:502:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalArduinoML.g:502:1: (lv_actions_3_0= ruleAction )
            	    // InternalArduinoML.g:503:3: lv_actions_3_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_14);
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
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalArduinoML.g:519:3: ( (lv_errors_4_0= ruleSinkError ) )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalArduinoML.g:520:1: (lv_errors_4_0= ruleSinkError )
            	    {
            	    // InternalArduinoML.g:520:1: (lv_errors_4_0= ruleSinkError )
            	    // InternalArduinoML.g:521:3: lv_errors_4_0= ruleSinkError
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getErrorsSinkErrorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_errors_4_0=ruleSinkError();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"errors",
            	            		lv_errors_4_0, 
            	            		"arduinoML.concretesyntax.ArduinoML.SinkError");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalArduinoML.g:537:3: ( (lv_transitions_5_0= ruleTransition ) )
            // InternalArduinoML.g:538:1: (lv_transitions_5_0= ruleTransition )
            {
            // InternalArduinoML.g:538:1: (lv_transitions_5_0= ruleTransition )
            // InternalArduinoML.g:539:3: lv_transitions_5_0= ruleTransition
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_15);
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

            // InternalArduinoML.g:555:2: ( (lv_transitions_6_0= ruleTransition ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArduinoML.g:556:1: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // InternalArduinoML.g:556:1: (lv_transitions_6_0= ruleTransition )
            	    // InternalArduinoML.g:557:3: lv_transitions_6_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalArduinoML.g:585:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalArduinoML.g:586:2: (iv_ruleAction= ruleAction EOF )
            // InternalArduinoML.g:587:2: iv_ruleAction= ruleAction EOF
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
    // InternalArduinoML.g:594:1: ruleAction returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_analogvalue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:597:28: ( ( ( ( ruleEString ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) ) ) )
            // InternalArduinoML.g:598:1: ( ( ( ruleEString ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) ) )
            {
            // InternalArduinoML.g:598:1: ( ( ( ruleEString ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) ) )
            // InternalArduinoML.g:598:2: ( ( ruleEString ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) )
            {
            // InternalArduinoML.g:598:2: ( ( ruleEString ) )
            // InternalArduinoML.g:599:1: ( ruleEString )
            {
            // InternalArduinoML.g:599:1: ( ruleEString )
            // InternalArduinoML.g:600:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_16);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_17); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getEqualsSignKeyword_1());
                
            // InternalArduinoML.g:617:1: ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=27 && LA9_0<=28)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT||LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalArduinoML.g:617:2: ( (lv_value_2_0= ruleSignal ) )
                    {
                    // InternalArduinoML.g:617:2: ( (lv_value_2_0= ruleSignal ) )
                    // InternalArduinoML.g:618:1: (lv_value_2_0= ruleSignal )
                    {
                    // InternalArduinoML.g:618:1: (lv_value_2_0= ruleSignal )
                    // InternalArduinoML.g:619:3: lv_value_2_0= ruleSignal
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_2_0_0()); 
                    	    
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
                    break;
                case 2 :
                    // InternalArduinoML.g:636:6: ( (lv_analogvalue_3_0= ruleEInt ) )
                    {
                    // InternalArduinoML.g:636:6: ( (lv_analogvalue_3_0= ruleEInt ) )
                    // InternalArduinoML.g:637:1: (lv_analogvalue_3_0= ruleEInt )
                    {
                    // InternalArduinoML.g:637:1: (lv_analogvalue_3_0= ruleEInt )
                    // InternalArduinoML.g:638:3: lv_analogvalue_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getAnalogvalueEIntParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_analogvalue_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"analogvalue",
                            		lv_analogvalue_3_0, 
                            		"arduinoML.concretesyntax.ArduinoML.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalArduinoML.g:662:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalArduinoML.g:663:2: (iv_ruleTransition= ruleTransition EOF )
            // InternalArduinoML.g:664:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalArduinoML.g:671:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' ( ( ruleEString ) ) ) ;
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
            // InternalArduinoML.g:674:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' ( ( ruleEString ) ) ) )
            // InternalArduinoML.g:675:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' ( ( ruleEString ) ) )
            {
            // InternalArduinoML.g:675:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' ( ( ruleEString ) ) )
            // InternalArduinoML.g:675:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_18); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_1());
                
            // InternalArduinoML.g:683:1: ( (lv_basecondition_2_0= ruleBaseCondition ) )
            // InternalArduinoML.g:684:1: (lv_basecondition_2_0= ruleBaseCondition )
            {
            // InternalArduinoML.g:684:1: (lv_basecondition_2_0= ruleBaseCondition )
            // InternalArduinoML.g:685:3: lv_basecondition_2_0= ruleBaseCondition
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getBaseconditionBaseConditionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_19);
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

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_20); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_3());
                
            // InternalArduinoML.g:705:1: ( (lv_booleancondition_4_0= ruleBooleanCondition ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=29 && LA10_0<=30)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArduinoML.g:706:1: (lv_booleancondition_4_0= ruleBooleanCondition )
            	    {
            	    // InternalArduinoML.g:706:1: (lv_booleancondition_4_0= ruleBooleanCondition )
            	    // InternalArduinoML.g:707:3: lv_booleancondition_4_0= ruleBooleanCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransitionAccess().getBooleanconditionBooleanConditionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_20);
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
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_5());
                
            // InternalArduinoML.g:727:1: ( ( ruleEString ) )
            // InternalArduinoML.g:728:1: ( ruleEString )
            {
            // InternalArduinoML.g:728:1: ( ruleEString )
            // InternalArduinoML.g:729:3: ruleEString
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
    // InternalArduinoML.g:750:1: entryRuleBaseCondition returns [EObject current=null] : iv_ruleBaseCondition= ruleBaseCondition EOF ;
    public final EObject entryRuleBaseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseCondition = null;


        try {
            // InternalArduinoML.g:751:2: (iv_ruleBaseCondition= ruleBaseCondition EOF )
            // InternalArduinoML.g:752:2: iv_ruleBaseCondition= ruleBaseCondition EOF
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
    // InternalArduinoML.g:759:1: ruleBaseCondition returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) ) ) ;
    public final EObject ruleBaseCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_comparator_1_0 = null;

        Enumerator lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_analogvalue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:762:28: ( ( ( ( ruleEString ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) ) ) )
            // InternalArduinoML.g:763:1: ( ( ( ruleEString ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) ) )
            {
            // InternalArduinoML.g:763:1: ( ( ( ruleEString ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) ) )
            // InternalArduinoML.g:763:2: ( ( ruleEString ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) )
            {
            // InternalArduinoML.g:763:2: ( ( ruleEString ) )
            // InternalArduinoML.g:764:1: ( ruleEString )
            {
            // InternalArduinoML.g:764:1: ( ruleEString )
            // InternalArduinoML.g:765:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBaseConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBaseConditionAccess().getSensorSensorCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalArduinoML.g:778:2: ( (lv_comparator_1_0= ruleComparator ) )
            // InternalArduinoML.g:779:1: (lv_comparator_1_0= ruleComparator )
            {
            // InternalArduinoML.g:779:1: (lv_comparator_1_0= ruleComparator )
            // InternalArduinoML.g:780:3: lv_comparator_1_0= ruleComparator
            {
             
            	        newCompositeNode(grammarAccess.getBaseConditionAccess().getComparatorComparatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_comparator_1_0=ruleComparator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseConditionRule());
            	        }
                   		set(
                   			current, 
                   			"comparator",
                    		lv_comparator_1_0, 
                    		"arduinoML.concretesyntax.ArduinoML.Comparator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalArduinoML.g:796:2: ( ( (lv_value_2_0= ruleSignal ) ) | ( (lv_analogvalue_3_0= ruleEInt ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=27 && LA11_0<=28)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT||LA11_0==20) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalArduinoML.g:796:3: ( (lv_value_2_0= ruleSignal ) )
                    {
                    // InternalArduinoML.g:796:3: ( (lv_value_2_0= ruleSignal ) )
                    // InternalArduinoML.g:797:1: (lv_value_2_0= ruleSignal )
                    {
                    // InternalArduinoML.g:797:1: (lv_value_2_0= ruleSignal )
                    // InternalArduinoML.g:798:3: lv_value_2_0= ruleSignal
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseConditionAccess().getValueSignalEnumRuleCall_2_0_0()); 
                    	    
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
                    break;
                case 2 :
                    // InternalArduinoML.g:815:6: ( (lv_analogvalue_3_0= ruleEInt ) )
                    {
                    // InternalArduinoML.g:815:6: ( (lv_analogvalue_3_0= ruleEInt ) )
                    // InternalArduinoML.g:816:1: (lv_analogvalue_3_0= ruleEInt )
                    {
                    // InternalArduinoML.g:816:1: (lv_analogvalue_3_0= ruleEInt )
                    // InternalArduinoML.g:817:3: lv_analogvalue_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseConditionAccess().getAnalogvalueEIntParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_analogvalue_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBaseConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"analogvalue",
                            		lv_analogvalue_3_0, 
                            		"arduinoML.concretesyntax.ArduinoML.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleBaseCondition"


    // $ANTLR start "entryRuleBooleanCondition"
    // InternalArduinoML.g:841:1: entryRuleBooleanCondition returns [EObject current=null] : iv_ruleBooleanCondition= ruleBooleanCondition EOF ;
    public final EObject entryRuleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanCondition = null;


        try {
            // InternalArduinoML.g:842:2: (iv_ruleBooleanCondition= ruleBooleanCondition EOF )
            // InternalArduinoML.g:843:2: iv_ruleBooleanCondition= ruleBooleanCondition EOF
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
    // InternalArduinoML.g:850:1: ruleBooleanCondition returns [EObject current=null] : ( ( (lv_operator_0_0= ruleOperator ) ) otherlv_1= '(' ( ( ruleEString ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( ( (lv_value_4_0= ruleSignal ) ) | ( (lv_analogvalue_5_0= ruleEInt ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleBooleanCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Enumerator lv_operator_0_0 = null;

        Enumerator lv_comparator_3_0 = null;

        Enumerator lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_analogvalue_5_0 = null;


         enterRule(); 
            
        try {
            // InternalArduinoML.g:853:28: ( ( ( (lv_operator_0_0= ruleOperator ) ) otherlv_1= '(' ( ( ruleEString ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( ( (lv_value_4_0= ruleSignal ) ) | ( (lv_analogvalue_5_0= ruleEInt ) ) ) otherlv_6= ')' ) )
            // InternalArduinoML.g:854:1: ( ( (lv_operator_0_0= ruleOperator ) ) otherlv_1= '(' ( ( ruleEString ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( ( (lv_value_4_0= ruleSignal ) ) | ( (lv_analogvalue_5_0= ruleEInt ) ) ) otherlv_6= ')' )
            {
            // InternalArduinoML.g:854:1: ( ( (lv_operator_0_0= ruleOperator ) ) otherlv_1= '(' ( ( ruleEString ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( ( (lv_value_4_0= ruleSignal ) ) | ( (lv_analogvalue_5_0= ruleEInt ) ) ) otherlv_6= ')' )
            // InternalArduinoML.g:854:2: ( (lv_operator_0_0= ruleOperator ) ) otherlv_1= '(' ( ( ruleEString ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( ( (lv_value_4_0= ruleSignal ) ) | ( (lv_analogvalue_5_0= ruleEInt ) ) ) otherlv_6= ')'
            {
            // InternalArduinoML.g:854:2: ( (lv_operator_0_0= ruleOperator ) )
            // InternalArduinoML.g:855:1: (lv_operator_0_0= ruleOperator )
            {
            // InternalArduinoML.g:855:1: (lv_operator_0_0= ruleOperator )
            // InternalArduinoML.g:856:3: lv_operator_0_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getOperatorOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
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
                
            // InternalArduinoML.g:876:1: ( ( ruleEString ) )
            // InternalArduinoML.g:877:1: ( ruleEString )
            {
            // InternalArduinoML.g:877:1: ( ruleEString )
            // InternalArduinoML.g:878:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getSensorSensorCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalArduinoML.g:891:2: ( (lv_comparator_3_0= ruleComparator ) )
            // InternalArduinoML.g:892:1: (lv_comparator_3_0= ruleComparator )
            {
            // InternalArduinoML.g:892:1: (lv_comparator_3_0= ruleComparator )
            // InternalArduinoML.g:893:3: lv_comparator_3_0= ruleComparator
            {
             
            	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getComparatorComparatorEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_comparator_3_0=ruleComparator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
            	        }
                   		set(
                   			current, 
                   			"comparator",
                    		lv_comparator_3_0, 
                    		"arduinoML.concretesyntax.ArduinoML.Comparator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalArduinoML.g:909:2: ( ( (lv_value_4_0= ruleSignal ) ) | ( (lv_analogvalue_5_0= ruleEInt ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=27 && LA12_0<=28)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT||LA12_0==20) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalArduinoML.g:909:3: ( (lv_value_4_0= ruleSignal ) )
                    {
                    // InternalArduinoML.g:909:3: ( (lv_value_4_0= ruleSignal ) )
                    // InternalArduinoML.g:910:1: (lv_value_4_0= ruleSignal )
                    {
                    // InternalArduinoML.g:910:1: (lv_value_4_0= ruleSignal )
                    // InternalArduinoML.g:911:3: lv_value_4_0= ruleSignal
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getValueSignalEnumRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_19);
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


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:928:6: ( (lv_analogvalue_5_0= ruleEInt ) )
                    {
                    // InternalArduinoML.g:928:6: ( (lv_analogvalue_5_0= ruleEInt ) )
                    // InternalArduinoML.g:929:1: (lv_analogvalue_5_0= ruleEInt )
                    {
                    // InternalArduinoML.g:929:1: (lv_analogvalue_5_0= ruleEInt )
                    // InternalArduinoML.g:930:3: lv_analogvalue_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getAnalogvalueEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_analogvalue_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"analogvalue",
                            		lv_analogvalue_5_0, 
                            		"arduinoML.concretesyntax.ArduinoML.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getBooleanConditionAccess().getRightParenthesisKeyword_5());
                

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
    // InternalArduinoML.g:958:1: entryRuleSinkError returns [EObject current=null] : iv_ruleSinkError= ruleSinkError EOF ;
    public final EObject entryRuleSinkError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinkError = null;


        try {
            // InternalArduinoML.g:959:2: (iv_ruleSinkError= ruleSinkError EOF )
            // InternalArduinoML.g:960:2: iv_ruleSinkError= ruleSinkError EOF
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
    // InternalArduinoML.g:967:1: ruleSinkError returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' otherlv_6= 'error' ( (lv_value_7_0= ruleEInt ) ) ) ;
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
            // InternalArduinoML.g:970:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' otherlv_6= 'error' ( (lv_value_7_0= ruleEInt ) ) ) )
            // InternalArduinoML.g:971:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' otherlv_6= 'error' ( (lv_value_7_0= ruleEInt ) ) )
            {
            // InternalArduinoML.g:971:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' otherlv_6= 'error' ( (lv_value_7_0= ruleEInt ) ) )
            // InternalArduinoML.g:971:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_basecondition_2_0= ruleBaseCondition ) ) otherlv_3= ')' ( (lv_booleancondition_4_0= ruleBooleanCondition ) )* otherlv_5= '=>' otherlv_6= 'error' ( (lv_value_7_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_18); 

                	newLeafNode(otherlv_0, grammarAccess.getSinkErrorAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getSinkErrorAccess().getLeftParenthesisKeyword_1());
                
            // InternalArduinoML.g:979:1: ( (lv_basecondition_2_0= ruleBaseCondition ) )
            // InternalArduinoML.g:980:1: (lv_basecondition_2_0= ruleBaseCondition )
            {
            // InternalArduinoML.g:980:1: (lv_basecondition_2_0= ruleBaseCondition )
            // InternalArduinoML.g:981:3: lv_basecondition_2_0= ruleBaseCondition
            {
             
            	        newCompositeNode(grammarAccess.getSinkErrorAccess().getBaseconditionBaseConditionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_19);
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

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_20); 

                	newLeafNode(otherlv_3, grammarAccess.getSinkErrorAccess().getRightParenthesisKeyword_3());
                
            // InternalArduinoML.g:1001:1: ( (lv_booleancondition_4_0= ruleBooleanCondition ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=30)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArduinoML.g:1002:1: (lv_booleancondition_4_0= ruleBooleanCondition )
            	    {
            	    // InternalArduinoML.g:1002:1: (lv_booleancondition_4_0= ruleBooleanCondition )
            	    // InternalArduinoML.g:1003:3: lv_booleancondition_4_0= ruleBooleanCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSinkErrorAccess().getBooleanconditionBooleanConditionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_20);
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
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_5, grammarAccess.getSinkErrorAccess().getEqualsSignGreaterThanSignKeyword_5());
                
            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_12); 

                	newLeafNode(otherlv_6, grammarAccess.getSinkErrorAccess().getErrorKeyword_6());
                
            // InternalArduinoML.g:1027:1: ( (lv_value_7_0= ruleEInt ) )
            // InternalArduinoML.g:1028:1: (lv_value_7_0= ruleEInt )
            {
            // InternalArduinoML.g:1028:1: (lv_value_7_0= ruleEInt )
            // InternalArduinoML.g:1029:3: lv_value_7_0= ruleEInt
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
    // InternalArduinoML.g:1053:1: ruleSignal returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSignal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalArduinoML.g:1055:28: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalArduinoML.g:1056:1: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalArduinoML.g:1056:1: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalArduinoML.g:1056:2: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalArduinoML.g:1056:2: (enumLiteral_0= 'HIGH' )
                    // InternalArduinoML.g:1056:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1062:6: (enumLiteral_1= 'LOW' )
                    {
                    // InternalArduinoML.g:1062:6: (enumLiteral_1= 'LOW' )
                    // InternalArduinoML.g:1062:8: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,28,FollowSets000.FOLLOW_2); 

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
    // InternalArduinoML.g:1072:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalArduinoML.g:1074:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalArduinoML.g:1075:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalArduinoML.g:1075:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            else if ( (LA15_0==30) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalArduinoML.g:1075:2: (enumLiteral_0= 'AND' )
                    {
                    // InternalArduinoML.g:1075:2: (enumLiteral_0= 'AND' )
                    // InternalArduinoML.g:1075:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1081:6: (enumLiteral_1= 'OR' )
                    {
                    // InternalArduinoML.g:1081:6: (enumLiteral_1= 'OR' )
                    // InternalArduinoML.g:1081:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_2); 

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


    // $ANTLR start "ruleComparator"
    // InternalArduinoML.g:1091:1: ruleComparator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleComparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalArduinoML.g:1093:28: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) )
            // InternalArduinoML.g:1094:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            {
            // InternalArduinoML.g:1094:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            case 34:
                {
                alt16=4;
                }
                break;
            case 35:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalArduinoML.g:1094:2: (enumLiteral_0= '>' )
                    {
                    // InternalArduinoML.g:1094:2: (enumLiteral_0= '>' )
                    // InternalArduinoML.g:1094:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparatorAccess().getSupEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparatorAccess().getSupEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1100:6: (enumLiteral_1= '<' )
                    {
                    // InternalArduinoML.g:1100:6: (enumLiteral_1= '<' )
                    // InternalArduinoML.g:1100:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparatorAccess().getInfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparatorAccess().getInfEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:1106:6: (enumLiteral_2= '==' )
                    {
                    // InternalArduinoML.g:1106:6: (enumLiteral_2= '==' )
                    // InternalArduinoML.g:1106:8: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparatorAccess().getEquEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparatorAccess().getEquEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalArduinoML.g:1112:6: (enumLiteral_3= '>=' )
                    {
                    // InternalArduinoML.g:1112:6: (enumLiteral_3= '>=' )
                    // InternalArduinoML.g:1112:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparatorAccess().getEsupEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparatorAccess().getEsupEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalArduinoML.g:1118:6: (enumLiteral_4= '<=' )
                    {
                    // InternalArduinoML.g:1118:6: (enumLiteral_4= '<=' )
                    // InternalArduinoML.g:1118:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,35,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparatorAccess().getEinfEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparatorAccess().getEinfEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleComparator"


    // $ANTLR start "ruleType"
    // InternalArduinoML.g:1128:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'analog' ) | (enumLiteral_1= 'digital' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalArduinoML.g:1130:28: ( ( (enumLiteral_0= 'analog' ) | (enumLiteral_1= 'digital' ) ) )
            // InternalArduinoML.g:1131:1: ( (enumLiteral_0= 'analog' ) | (enumLiteral_1= 'digital' ) )
            {
            // InternalArduinoML.g:1131:1: ( (enumLiteral_0= 'analog' ) | (enumLiteral_1= 'digital' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            else if ( (LA17_0==37) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalArduinoML.g:1131:2: (enumLiteral_0= 'analog' )
                    {
                    // InternalArduinoML.g:1131:2: (enumLiteral_0= 'analog' )
                    // InternalArduinoML.g:1131:4: enumLiteral_0= 'analog'
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getTypeAccess().getAnalogEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getAnalogEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1137:6: (enumLiteral_1= 'digital' )
                    {
                    // InternalArduinoML.g:1137:6: (enumLiteral_1= 'digital' )
                    // InternalArduinoML.g:1137:8: enumLiteral_1= 'digital'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getTypeAccess().getDigitalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getDigitalEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleType"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\41\uffff";
    static final String dfa_2s = "\1\26\1\27\1\4\2\37\5\6\2\30\1\6\1\30\1\31\2\27\2\4\2\uffff\2\37\5\6\2\30\1\6\1\30\1\31";
    static final String dfa_3s = "\1\26\1\27\1\5\2\43\5\34\2\30\1\6\1\30\1\36\2\27\1\32\1\5\2\uffff\2\43\5\34\2\30\1\6\1\30\1\36";
    static final String dfa_4s = "\23\uffff\1\2\1\1\14\uffff";
    static final String dfa_5s = "\41\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5\1\6\1\7\1\10\1\11",
            "\1\5\1\6\1\7\1\10\1\11",
            "\1\15\15\uffff\1\14\6\uffff\1\12\1\13",
            "\1\15\15\uffff\1\14\6\uffff\1\12\1\13",
            "\1\15\15\uffff\1\14\6\uffff\1\12\1\13",
            "\1\15\15\uffff\1\14\6\uffff\1\12\1\13",
            "\1\15\15\uffff\1\14\6\uffff\1\12\1\13",
            "\1\16",
            "\1\16",
            "\1\15",
            "\1\16",
            "\1\21\3\uffff\1\17\1\20",
            "\1\22",
            "\1\22",
            "\2\23\24\uffff\1\24",
            "\1\25\1\26",
            "",
            "",
            "\1\27\1\30\1\31\1\32\1\33",
            "\1\27\1\30\1\31\1\32\1\33",
            "\1\37\15\uffff\1\36\6\uffff\1\34\1\35",
            "\1\37\15\uffff\1\36\6\uffff\1\34\1\35",
            "\1\37\15\uffff\1\36\6\uffff\1\34\1\35",
            "\1\37\15\uffff\1\36\6\uffff\1\34\1\35",
            "\1\37\15\uffff\1\36\6\uffff\1\34\1\35",
            "\1\40",
            "\1\40",
            "\1\37",
            "\1\40",
            "\1\21\3\uffff\1\17\1\20"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 519:3: ( (lv_errors_4_0= ruleSinkError ) )*";
        }
    }
 

    
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
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000410030L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018100040L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000062000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000F80000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    }


}