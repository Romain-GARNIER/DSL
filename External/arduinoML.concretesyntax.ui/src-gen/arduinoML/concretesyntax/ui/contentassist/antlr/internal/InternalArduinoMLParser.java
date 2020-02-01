package arduinoML.concretesyntax.ui.contentassist.antlr.internal; 

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
import arduinoML.concretesyntax.services.ArduinoMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'HIGH'", "'LOW'", "'AND'", "'OR'", "'app'", "'initial state'", "'{'", "'bricks'", "'states'", "'}'", "':'", "'Actuator'", "'Sensor'", "'-'", "'<='", "'if'", "'('", "')'", "'=>'", "'is'", "'error'"
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
     	
        public void setGrammarAccess(ArduinoMLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleApp"
    // InternalArduinoML.g:60:1: entryRuleApp : ruleApp EOF ;
    public final void entryRuleApp() throws RecognitionException {
        try {
            // InternalArduinoML.g:61:1: ( ruleApp EOF )
            // InternalArduinoML.g:62:1: ruleApp EOF
            {
             before(grammarAccess.getAppRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleApp();

            state._fsp--;

             after(grammarAccess.getAppRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalArduinoML.g:69:1: ruleApp : ( ( rule__App__Group__0 ) ) ;
    public final void ruleApp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:73:2: ( ( ( rule__App__Group__0 ) ) )
            // InternalArduinoML.g:74:1: ( ( rule__App__Group__0 ) )
            {
            // InternalArduinoML.g:74:1: ( ( rule__App__Group__0 ) )
            // InternalArduinoML.g:75:1: ( rule__App__Group__0 )
            {
             before(grammarAccess.getAppAccess().getGroup()); 
            // InternalArduinoML.g:76:1: ( rule__App__Group__0 )
            // InternalArduinoML.g:76:2: rule__App__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getGroup()); 

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
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleBrick"
    // InternalArduinoML.g:88:1: entryRuleBrick : ruleBrick EOF ;
    public final void entryRuleBrick() throws RecognitionException {
        try {
            // InternalArduinoML.g:89:1: ( ruleBrick EOF )
            // InternalArduinoML.g:90:1: ruleBrick EOF
            {
             before(grammarAccess.getBrickRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getBrickRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // InternalArduinoML.g:97:1: ruleBrick : ( ( rule__Brick__Group__0 ) ) ;
    public final void ruleBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:101:2: ( ( ( rule__Brick__Group__0 ) ) )
            // InternalArduinoML.g:102:1: ( ( rule__Brick__Group__0 ) )
            {
            // InternalArduinoML.g:102:1: ( ( rule__Brick__Group__0 ) )
            // InternalArduinoML.g:103:1: ( rule__Brick__Group__0 )
            {
             before(grammarAccess.getBrickAccess().getGroup()); 
            // InternalArduinoML.g:104:1: ( rule__Brick__Group__0 )
            // InternalArduinoML.g:104:2: rule__Brick__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Brick__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getGroup()); 

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
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleActuator"
    // InternalArduinoML.g:116:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalArduinoML.g:117:1: ( ruleActuator EOF )
            // InternalArduinoML.g:118:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalArduinoML.g:125:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:129:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalArduinoML.g:130:1: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalArduinoML.g:130:1: ( ( rule__Actuator__Group__0 ) )
            // InternalArduinoML.g:131:1: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalArduinoML.g:132:1: ( rule__Actuator__Group__0 )
            // InternalArduinoML.g:132:2: rule__Actuator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getGroup()); 

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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleSensor"
    // InternalArduinoML.g:144:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalArduinoML.g:145:1: ( ruleSensor EOF )
            // InternalArduinoML.g:146:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalArduinoML.g:153:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:157:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalArduinoML.g:158:1: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalArduinoML.g:158:1: ( ( rule__Sensor__Group__0 ) )
            // InternalArduinoML.g:159:1: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalArduinoML.g:160:1: ( rule__Sensor__Group__0 )
            // InternalArduinoML.g:160:2: rule__Sensor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleEString"
    // InternalArduinoML.g:172:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalArduinoML.g:173:1: ( ruleEString EOF )
            // InternalArduinoML.g:174:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalArduinoML.g:181:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:185:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalArduinoML.g:186:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalArduinoML.g:186:1: ( ( rule__EString__Alternatives ) )
            // InternalArduinoML.g:187:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalArduinoML.g:188:1: ( rule__EString__Alternatives )
            // InternalArduinoML.g:188:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalArduinoML.g:200:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalArduinoML.g:201:1: ( ruleEInt EOF )
            // InternalArduinoML.g:202:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalArduinoML.g:209:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:213:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalArduinoML.g:214:1: ( ( rule__EInt__Group__0 ) )
            {
            // InternalArduinoML.g:214:1: ( ( rule__EInt__Group__0 ) )
            // InternalArduinoML.g:215:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalArduinoML.g:216:1: ( rule__EInt__Group__0 )
            // InternalArduinoML.g:216:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleState"
    // InternalArduinoML.g:228:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalArduinoML.g:229:1: ( ruleState EOF )
            // InternalArduinoML.g:230:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalArduinoML.g:237:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:241:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalArduinoML.g:242:1: ( ( rule__State__Group__0 ) )
            {
            // InternalArduinoML.g:242:1: ( ( rule__State__Group__0 ) )
            // InternalArduinoML.g:243:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalArduinoML.g:244:1: ( rule__State__Group__0 )
            // InternalArduinoML.g:244:2: rule__State__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAction"
    // InternalArduinoML.g:256:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalArduinoML.g:257:1: ( ruleAction EOF )
            // InternalArduinoML.g:258:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalArduinoML.g:265:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:269:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalArduinoML.g:270:1: ( ( rule__Action__Group__0 ) )
            {
            // InternalArduinoML.g:270:1: ( ( rule__Action__Group__0 ) )
            // InternalArduinoML.g:271:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalArduinoML.g:272:1: ( rule__Action__Group__0 )
            // InternalArduinoML.g:272:2: rule__Action__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalArduinoML.g:284:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalArduinoML.g:285:1: ( ruleTransition EOF )
            // InternalArduinoML.g:286:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalArduinoML.g:293:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:297:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalArduinoML.g:298:1: ( ( rule__Transition__Group__0 ) )
            {
            // InternalArduinoML.g:298:1: ( ( rule__Transition__Group__0 ) )
            // InternalArduinoML.g:299:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalArduinoML.g:300:1: ( rule__Transition__Group__0 )
            // InternalArduinoML.g:300:2: rule__Transition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleBaseCondition"
    // InternalArduinoML.g:312:1: entryRuleBaseCondition : ruleBaseCondition EOF ;
    public final void entryRuleBaseCondition() throws RecognitionException {
        try {
            // InternalArduinoML.g:313:1: ( ruleBaseCondition EOF )
            // InternalArduinoML.g:314:1: ruleBaseCondition EOF
            {
             before(grammarAccess.getBaseConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBaseCondition();

            state._fsp--;

             after(grammarAccess.getBaseConditionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBaseCondition"


    // $ANTLR start "ruleBaseCondition"
    // InternalArduinoML.g:321:1: ruleBaseCondition : ( ( rule__BaseCondition__Group__0 ) ) ;
    public final void ruleBaseCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:325:2: ( ( ( rule__BaseCondition__Group__0 ) ) )
            // InternalArduinoML.g:326:1: ( ( rule__BaseCondition__Group__0 ) )
            {
            // InternalArduinoML.g:326:1: ( ( rule__BaseCondition__Group__0 ) )
            // InternalArduinoML.g:327:1: ( rule__BaseCondition__Group__0 )
            {
             before(grammarAccess.getBaseConditionAccess().getGroup()); 
            // InternalArduinoML.g:328:1: ( rule__BaseCondition__Group__0 )
            // InternalArduinoML.g:328:2: rule__BaseCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BaseCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleBaseCondition"


    // $ANTLR start "entryRuleBooleanCondition"
    // InternalArduinoML.g:340:1: entryRuleBooleanCondition : ruleBooleanCondition EOF ;
    public final void entryRuleBooleanCondition() throws RecognitionException {
        try {
            // InternalArduinoML.g:341:1: ( ruleBooleanCondition EOF )
            // InternalArduinoML.g:342:1: ruleBooleanCondition EOF
            {
             before(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBooleanCondition();

            state._fsp--;

             after(grammarAccess.getBooleanConditionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // InternalArduinoML.g:349:1: ruleBooleanCondition : ( ( rule__BooleanCondition__Group__0 ) ) ;
    public final void ruleBooleanCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:353:2: ( ( ( rule__BooleanCondition__Group__0 ) ) )
            // InternalArduinoML.g:354:1: ( ( rule__BooleanCondition__Group__0 ) )
            {
            // InternalArduinoML.g:354:1: ( ( rule__BooleanCondition__Group__0 ) )
            // InternalArduinoML.g:355:1: ( rule__BooleanCondition__Group__0 )
            {
             before(grammarAccess.getBooleanConditionAccess().getGroup()); 
            // InternalArduinoML.g:356:1: ( rule__BooleanCondition__Group__0 )
            // InternalArduinoML.g:356:2: rule__BooleanCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleSinkError"
    // InternalArduinoML.g:368:1: entryRuleSinkError : ruleSinkError EOF ;
    public final void entryRuleSinkError() throws RecognitionException {
        try {
            // InternalArduinoML.g:369:1: ( ruleSinkError EOF )
            // InternalArduinoML.g:370:1: ruleSinkError EOF
            {
             before(grammarAccess.getSinkErrorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSinkError();

            state._fsp--;

             after(grammarAccess.getSinkErrorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSinkError"


    // $ANTLR start "ruleSinkError"
    // InternalArduinoML.g:377:1: ruleSinkError : ( ( rule__SinkError__Group__0 ) ) ;
    public final void ruleSinkError() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:381:2: ( ( ( rule__SinkError__Group__0 ) ) )
            // InternalArduinoML.g:382:1: ( ( rule__SinkError__Group__0 ) )
            {
            // InternalArduinoML.g:382:1: ( ( rule__SinkError__Group__0 ) )
            // InternalArduinoML.g:383:1: ( rule__SinkError__Group__0 )
            {
             before(grammarAccess.getSinkErrorAccess().getGroup()); 
            // InternalArduinoML.g:384:1: ( rule__SinkError__Group__0 )
            // InternalArduinoML.g:384:2: rule__SinkError__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SinkError__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSinkErrorAccess().getGroup()); 

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
    // $ANTLR end "ruleSinkError"


    // $ANTLR start "ruleSignal"
    // InternalArduinoML.g:397:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:401:1: ( ( ( rule__Signal__Alternatives ) ) )
            // InternalArduinoML.g:402:1: ( ( rule__Signal__Alternatives ) )
            {
            // InternalArduinoML.g:402:1: ( ( rule__Signal__Alternatives ) )
            // InternalArduinoML.g:403:1: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // InternalArduinoML.g:404:1: ( rule__Signal__Alternatives )
            // InternalArduinoML.g:404:2: rule__Signal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Signal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSignal"


    // $ANTLR start "ruleOperator"
    // InternalArduinoML.g:416:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:420:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalArduinoML.g:421:1: ( ( rule__Operator__Alternatives ) )
            {
            // InternalArduinoML.g:421:1: ( ( rule__Operator__Alternatives ) )
            // InternalArduinoML.g:422:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalArduinoML.g:423:1: ( rule__Operator__Alternatives )
            // InternalArduinoML.g:423:2: rule__Operator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__Brick__Alternatives_0"
    // InternalArduinoML.g:434:1: rule__Brick__Alternatives_0 : ( ( ruleSensor ) | ( ruleActuator ) );
    public final void rule__Brick__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:438:1: ( ( ruleSensor ) | ( ruleActuator ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalArduinoML.g:439:1: ( ruleSensor )
                    {
                    // InternalArduinoML.g:439:1: ( ruleSensor )
                    // InternalArduinoML.g:440:1: ruleSensor
                    {
                     before(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:445:6: ( ruleActuator )
                    {
                    // InternalArduinoML.g:445:6: ( ruleActuator )
                    // InternalArduinoML.g:446:1: ruleActuator
                    {
                     before(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleActuator();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Brick__Alternatives_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalArduinoML.g:456:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:460:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalArduinoML.g:461:1: ( RULE_STRING )
                    {
                    // InternalArduinoML.g:461:1: ( RULE_STRING )
                    // InternalArduinoML.g:462:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:467:6: ( RULE_ID )
                    {
                    // InternalArduinoML.g:467:6: ( RULE_ID )
                    // InternalArduinoML.g:468:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Signal__Alternatives"
    // InternalArduinoML.g:478:1: rule__Signal__Alternatives : ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:482:1: ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoML.g:483:1: ( ( 'HIGH' ) )
                    {
                    // InternalArduinoML.g:483:1: ( ( 'HIGH' ) )
                    // InternalArduinoML.g:484:1: ( 'HIGH' )
                    {
                     before(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:485:1: ( 'HIGH' )
                    // InternalArduinoML.g:485:3: 'HIGH'
                    {
                    match(input,11,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:490:6: ( ( 'LOW' ) )
                    {
                    // InternalArduinoML.g:490:6: ( ( 'LOW' ) )
                    // InternalArduinoML.g:491:1: ( 'LOW' )
                    {
                     before(grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:492:1: ( 'LOW' )
                    // InternalArduinoML.g:492:3: 'LOW'
                    {
                    match(input,12,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Signal__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalArduinoML.g:502:1: rule__Operator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:506:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduinoML.g:507:1: ( ( 'AND' ) )
                    {
                    // InternalArduinoML.g:507:1: ( ( 'AND' ) )
                    // InternalArduinoML.g:508:1: ( 'AND' )
                    {
                     before(grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:509:1: ( 'AND' )
                    // InternalArduinoML.g:509:3: 'AND'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:514:6: ( ( 'OR' ) )
                    {
                    // InternalArduinoML.g:514:6: ( ( 'OR' ) )
                    // InternalArduinoML.g:515:1: ( 'OR' )
                    {
                     before(grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:516:1: ( 'OR' )
                    // InternalArduinoML.g:516:3: 'OR'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__App__Group__0"
    // InternalArduinoML.g:528:1: rule__App__Group__0 : rule__App__Group__0__Impl rule__App__Group__1 ;
    public final void rule__App__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:532:1: ( rule__App__Group__0__Impl rule__App__Group__1 )
            // InternalArduinoML.g:533:2: rule__App__Group__0__Impl rule__App__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__App__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__1();

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
    // $ANTLR end "rule__App__Group__0"


    // $ANTLR start "rule__App__Group__0__Impl"
    // InternalArduinoML.g:540:1: rule__App__Group__0__Impl : ( 'app' ) ;
    public final void rule__App__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:544:1: ( ( 'app' ) )
            // InternalArduinoML.g:545:1: ( 'app' )
            {
            // InternalArduinoML.g:545:1: ( 'app' )
            // InternalArduinoML.g:546:1: 'app'
            {
             before(grammarAccess.getAppAccess().getAppKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAppAccess().getAppKeyword_0()); 

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
    // $ANTLR end "rule__App__Group__0__Impl"


    // $ANTLR start "rule__App__Group__1"
    // InternalArduinoML.g:559:1: rule__App__Group__1 : rule__App__Group__1__Impl rule__App__Group__2 ;
    public final void rule__App__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:563:1: ( rule__App__Group__1__Impl rule__App__Group__2 )
            // InternalArduinoML.g:564:2: rule__App__Group__1__Impl rule__App__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__App__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__2();

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
    // $ANTLR end "rule__App__Group__1"


    // $ANTLR start "rule__App__Group__1__Impl"
    // InternalArduinoML.g:571:1: rule__App__Group__1__Impl : ( ( rule__App__NameAssignment_1 ) ) ;
    public final void rule__App__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:575:1: ( ( ( rule__App__NameAssignment_1 ) ) )
            // InternalArduinoML.g:576:1: ( ( rule__App__NameAssignment_1 ) )
            {
            // InternalArduinoML.g:576:1: ( ( rule__App__NameAssignment_1 ) )
            // InternalArduinoML.g:577:1: ( rule__App__NameAssignment_1 )
            {
             before(grammarAccess.getAppAccess().getNameAssignment_1()); 
            // InternalArduinoML.g:578:1: ( rule__App__NameAssignment_1 )
            // InternalArduinoML.g:578:2: rule__App__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__App__Group__1__Impl"


    // $ANTLR start "rule__App__Group__2"
    // InternalArduinoML.g:588:1: rule__App__Group__2 : rule__App__Group__2__Impl rule__App__Group__3 ;
    public final void rule__App__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:592:1: ( rule__App__Group__2__Impl rule__App__Group__3 )
            // InternalArduinoML.g:593:2: rule__App__Group__2__Impl rule__App__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__App__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__3();

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
    // $ANTLR end "rule__App__Group__2"


    // $ANTLR start "rule__App__Group__2__Impl"
    // InternalArduinoML.g:600:1: rule__App__Group__2__Impl : ( 'initial state' ) ;
    public final void rule__App__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:604:1: ( ( 'initial state' ) )
            // InternalArduinoML.g:605:1: ( 'initial state' )
            {
            // InternalArduinoML.g:605:1: ( 'initial state' )
            // InternalArduinoML.g:606:1: 'initial state'
            {
             before(grammarAccess.getAppAccess().getInitialStateKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAppAccess().getInitialStateKeyword_2()); 

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
    // $ANTLR end "rule__App__Group__2__Impl"


    // $ANTLR start "rule__App__Group__3"
    // InternalArduinoML.g:619:1: rule__App__Group__3 : rule__App__Group__3__Impl rule__App__Group__4 ;
    public final void rule__App__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:623:1: ( rule__App__Group__3__Impl rule__App__Group__4 )
            // InternalArduinoML.g:624:2: rule__App__Group__3__Impl rule__App__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__App__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__4();

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
    // $ANTLR end "rule__App__Group__3"


    // $ANTLR start "rule__App__Group__3__Impl"
    // InternalArduinoML.g:631:1: rule__App__Group__3__Impl : ( ( rule__App__InitialAssignment_3 ) ) ;
    public final void rule__App__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:635:1: ( ( ( rule__App__InitialAssignment_3 ) ) )
            // InternalArduinoML.g:636:1: ( ( rule__App__InitialAssignment_3 ) )
            {
            // InternalArduinoML.g:636:1: ( ( rule__App__InitialAssignment_3 ) )
            // InternalArduinoML.g:637:1: ( rule__App__InitialAssignment_3 )
            {
             before(grammarAccess.getAppAccess().getInitialAssignment_3()); 
            // InternalArduinoML.g:638:1: ( rule__App__InitialAssignment_3 )
            // InternalArduinoML.g:638:2: rule__App__InitialAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__InitialAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getInitialAssignment_3()); 

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
    // $ANTLR end "rule__App__Group__3__Impl"


    // $ANTLR start "rule__App__Group__4"
    // InternalArduinoML.g:648:1: rule__App__Group__4 : rule__App__Group__4__Impl rule__App__Group__5 ;
    public final void rule__App__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:652:1: ( rule__App__Group__4__Impl rule__App__Group__5 )
            // InternalArduinoML.g:653:2: rule__App__Group__4__Impl rule__App__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__App__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__5();

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
    // $ANTLR end "rule__App__Group__4"


    // $ANTLR start "rule__App__Group__4__Impl"
    // InternalArduinoML.g:660:1: rule__App__Group__4__Impl : ( '{' ) ;
    public final void rule__App__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:664:1: ( ( '{' ) )
            // InternalArduinoML.g:665:1: ( '{' )
            {
            // InternalArduinoML.g:665:1: ( '{' )
            // InternalArduinoML.g:666:1: '{'
            {
             before(grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__App__Group__4__Impl"


    // $ANTLR start "rule__App__Group__5"
    // InternalArduinoML.g:679:1: rule__App__Group__5 : rule__App__Group__5__Impl rule__App__Group__6 ;
    public final void rule__App__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:683:1: ( rule__App__Group__5__Impl rule__App__Group__6 )
            // InternalArduinoML.g:684:2: rule__App__Group__5__Impl rule__App__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__App__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__6();

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
    // $ANTLR end "rule__App__Group__5"


    // $ANTLR start "rule__App__Group__5__Impl"
    // InternalArduinoML.g:691:1: rule__App__Group__5__Impl : ( 'bricks' ) ;
    public final void rule__App__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:695:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:696:1: ( 'bricks' )
            {
            // InternalArduinoML.g:696:1: ( 'bricks' )
            // InternalArduinoML.g:697:1: 'bricks'
            {
             before(grammarAccess.getAppAccess().getBricksKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAppAccess().getBricksKeyword_5()); 

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
    // $ANTLR end "rule__App__Group__5__Impl"


    // $ANTLR start "rule__App__Group__6"
    // InternalArduinoML.g:710:1: rule__App__Group__6 : rule__App__Group__6__Impl rule__App__Group__7 ;
    public final void rule__App__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:714:1: ( rule__App__Group__6__Impl rule__App__Group__7 )
            // InternalArduinoML.g:715:2: rule__App__Group__6__Impl rule__App__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__App__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__7();

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
    // $ANTLR end "rule__App__Group__6"


    // $ANTLR start "rule__App__Group__6__Impl"
    // InternalArduinoML.g:722:1: rule__App__Group__6__Impl : ( ( rule__App__BricksAssignment_6 ) ) ;
    public final void rule__App__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:726:1: ( ( ( rule__App__BricksAssignment_6 ) ) )
            // InternalArduinoML.g:727:1: ( ( rule__App__BricksAssignment_6 ) )
            {
            // InternalArduinoML.g:727:1: ( ( rule__App__BricksAssignment_6 ) )
            // InternalArduinoML.g:728:1: ( rule__App__BricksAssignment_6 )
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_6()); 
            // InternalArduinoML.g:729:1: ( rule__App__BricksAssignment_6 )
            // InternalArduinoML.g:729:2: rule__App__BricksAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__BricksAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getBricksAssignment_6()); 

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
    // $ANTLR end "rule__App__Group__6__Impl"


    // $ANTLR start "rule__App__Group__7"
    // InternalArduinoML.g:739:1: rule__App__Group__7 : rule__App__Group__7__Impl rule__App__Group__8 ;
    public final void rule__App__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:743:1: ( rule__App__Group__7__Impl rule__App__Group__8 )
            // InternalArduinoML.g:744:2: rule__App__Group__7__Impl rule__App__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__App__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__8();

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
    // $ANTLR end "rule__App__Group__7"


    // $ANTLR start "rule__App__Group__7__Impl"
    // InternalArduinoML.g:751:1: rule__App__Group__7__Impl : ( ( rule__App__BricksAssignment_7 )* ) ;
    public final void rule__App__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:755:1: ( ( ( rule__App__BricksAssignment_7 )* ) )
            // InternalArduinoML.g:756:1: ( ( rule__App__BricksAssignment_7 )* )
            {
            // InternalArduinoML.g:756:1: ( ( rule__App__BricksAssignment_7 )* )
            // InternalArduinoML.g:757:1: ( rule__App__BricksAssignment_7 )*
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_7()); 
            // InternalArduinoML.g:758:1: ( rule__App__BricksAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=22 && LA5_0<=23)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArduinoML.g:758:2: rule__App__BricksAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__App__BricksAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getBricksAssignment_7()); 

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
    // $ANTLR end "rule__App__Group__7__Impl"


    // $ANTLR start "rule__App__Group__8"
    // InternalArduinoML.g:768:1: rule__App__Group__8 : rule__App__Group__8__Impl rule__App__Group__9 ;
    public final void rule__App__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:772:1: ( rule__App__Group__8__Impl rule__App__Group__9 )
            // InternalArduinoML.g:773:2: rule__App__Group__8__Impl rule__App__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__App__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__9();

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
    // $ANTLR end "rule__App__Group__8"


    // $ANTLR start "rule__App__Group__8__Impl"
    // InternalArduinoML.g:780:1: rule__App__Group__8__Impl : ( 'states' ) ;
    public final void rule__App__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:784:1: ( ( 'states' ) )
            // InternalArduinoML.g:785:1: ( 'states' )
            {
            // InternalArduinoML.g:785:1: ( 'states' )
            // InternalArduinoML.g:786:1: 'states'
            {
             before(grammarAccess.getAppAccess().getStatesKeyword_8()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAppAccess().getStatesKeyword_8()); 

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
    // $ANTLR end "rule__App__Group__8__Impl"


    // $ANTLR start "rule__App__Group__9"
    // InternalArduinoML.g:799:1: rule__App__Group__9 : rule__App__Group__9__Impl rule__App__Group__10 ;
    public final void rule__App__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:803:1: ( rule__App__Group__9__Impl rule__App__Group__10 )
            // InternalArduinoML.g:804:2: rule__App__Group__9__Impl rule__App__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__App__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__10();

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
    // $ANTLR end "rule__App__Group__9"


    // $ANTLR start "rule__App__Group__9__Impl"
    // InternalArduinoML.g:811:1: rule__App__Group__9__Impl : ( ( rule__App__StatesAssignment_9 ) ) ;
    public final void rule__App__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:815:1: ( ( ( rule__App__StatesAssignment_9 ) ) )
            // InternalArduinoML.g:816:1: ( ( rule__App__StatesAssignment_9 ) )
            {
            // InternalArduinoML.g:816:1: ( ( rule__App__StatesAssignment_9 ) )
            // InternalArduinoML.g:817:1: ( rule__App__StatesAssignment_9 )
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_9()); 
            // InternalArduinoML.g:818:1: ( rule__App__StatesAssignment_9 )
            // InternalArduinoML.g:818:2: rule__App__StatesAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__StatesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getStatesAssignment_9()); 

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
    // $ANTLR end "rule__App__Group__9__Impl"


    // $ANTLR start "rule__App__Group__10"
    // InternalArduinoML.g:828:1: rule__App__Group__10 : rule__App__Group__10__Impl rule__App__Group__11 ;
    public final void rule__App__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:832:1: ( rule__App__Group__10__Impl rule__App__Group__11 )
            // InternalArduinoML.g:833:2: rule__App__Group__10__Impl rule__App__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__App__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__11();

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
    // $ANTLR end "rule__App__Group__10"


    // $ANTLR start "rule__App__Group__10__Impl"
    // InternalArduinoML.g:840:1: rule__App__Group__10__Impl : ( ( rule__App__StatesAssignment_10 )* ) ;
    public final void rule__App__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:844:1: ( ( ( rule__App__StatesAssignment_10 )* ) )
            // InternalArduinoML.g:845:1: ( ( rule__App__StatesAssignment_10 )* )
            {
            // InternalArduinoML.g:845:1: ( ( rule__App__StatesAssignment_10 )* )
            // InternalArduinoML.g:846:1: ( rule__App__StatesAssignment_10 )*
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_10()); 
            // InternalArduinoML.g:847:1: ( rule__App__StatesAssignment_10 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArduinoML.g:847:2: rule__App__StatesAssignment_10
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__App__StatesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getStatesAssignment_10()); 

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
    // $ANTLR end "rule__App__Group__10__Impl"


    // $ANTLR start "rule__App__Group__11"
    // InternalArduinoML.g:857:1: rule__App__Group__11 : rule__App__Group__11__Impl ;
    public final void rule__App__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:861:1: ( rule__App__Group__11__Impl )
            // InternalArduinoML.g:862:2: rule__App__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__App__Group__11__Impl();

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
    // $ANTLR end "rule__App__Group__11"


    // $ANTLR start "rule__App__Group__11__Impl"
    // InternalArduinoML.g:868:1: rule__App__Group__11__Impl : ( '}' ) ;
    public final void rule__App__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:872:1: ( ( '}' ) )
            // InternalArduinoML.g:873:1: ( '}' )
            {
            // InternalArduinoML.g:873:1: ( '}' )
            // InternalArduinoML.g:874:1: '}'
            {
             before(grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__App__Group__11__Impl"


    // $ANTLR start "rule__Brick__Group__0"
    // InternalArduinoML.g:911:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:915:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // InternalArduinoML.g:916:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Brick__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Brick__Group__1();

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
    // $ANTLR end "rule__Brick__Group__0"


    // $ANTLR start "rule__Brick__Group__0__Impl"
    // InternalArduinoML.g:923:1: rule__Brick__Group__0__Impl : ( ( rule__Brick__Alternatives_0 ) ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:927:1: ( ( ( rule__Brick__Alternatives_0 ) ) )
            // InternalArduinoML.g:928:1: ( ( rule__Brick__Alternatives_0 ) )
            {
            // InternalArduinoML.g:928:1: ( ( rule__Brick__Alternatives_0 ) )
            // InternalArduinoML.g:929:1: ( rule__Brick__Alternatives_0 )
            {
             before(grammarAccess.getBrickAccess().getAlternatives_0()); 
            // InternalArduinoML.g:930:1: ( rule__Brick__Alternatives_0 )
            // InternalArduinoML.g:930:2: rule__Brick__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Brick__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Brick__Group__0__Impl"


    // $ANTLR start "rule__Brick__Group__1"
    // InternalArduinoML.g:940:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:944:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // InternalArduinoML.g:945:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Brick__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Brick__Group__2();

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
    // $ANTLR end "rule__Brick__Group__1"


    // $ANTLR start "rule__Brick__Group__1__Impl"
    // InternalArduinoML.g:952:1: rule__Brick__Group__1__Impl : ( ( rule__Brick__NameAssignment_1 ) ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:956:1: ( ( ( rule__Brick__NameAssignment_1 ) ) )
            // InternalArduinoML.g:957:1: ( ( rule__Brick__NameAssignment_1 ) )
            {
            // InternalArduinoML.g:957:1: ( ( rule__Brick__NameAssignment_1 ) )
            // InternalArduinoML.g:958:1: ( rule__Brick__NameAssignment_1 )
            {
             before(grammarAccess.getBrickAccess().getNameAssignment_1()); 
            // InternalArduinoML.g:959:1: ( rule__Brick__NameAssignment_1 )
            // InternalArduinoML.g:959:2: rule__Brick__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Brick__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Brick__Group__1__Impl"


    // $ANTLR start "rule__Brick__Group__2"
    // InternalArduinoML.g:969:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:973:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // InternalArduinoML.g:974:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Brick__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Brick__Group__3();

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
    // $ANTLR end "rule__Brick__Group__2"


    // $ANTLR start "rule__Brick__Group__2__Impl"
    // InternalArduinoML.g:981:1: rule__Brick__Group__2__Impl : ( ':' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:985:1: ( ( ':' ) )
            // InternalArduinoML.g:986:1: ( ':' )
            {
            // InternalArduinoML.g:986:1: ( ':' )
            // InternalArduinoML.g:987:1: ':'
            {
             before(grammarAccess.getBrickAccess().getColonKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Brick__Group__2__Impl"


    // $ANTLR start "rule__Brick__Group__3"
    // InternalArduinoML.g:1000:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1004:1: ( rule__Brick__Group__3__Impl )
            // InternalArduinoML.g:1005:2: rule__Brick__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Brick__Group__3__Impl();

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
    // $ANTLR end "rule__Brick__Group__3"


    // $ANTLR start "rule__Brick__Group__3__Impl"
    // InternalArduinoML.g:1011:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__PinAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1015:1: ( ( ( rule__Brick__PinAssignment_3 ) ) )
            // InternalArduinoML.g:1016:1: ( ( rule__Brick__PinAssignment_3 ) )
            {
            // InternalArduinoML.g:1016:1: ( ( rule__Brick__PinAssignment_3 ) )
            // InternalArduinoML.g:1017:1: ( rule__Brick__PinAssignment_3 )
            {
             before(grammarAccess.getBrickAccess().getPinAssignment_3()); 
            // InternalArduinoML.g:1018:1: ( rule__Brick__PinAssignment_3 )
            // InternalArduinoML.g:1018:2: rule__Brick__PinAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Brick__PinAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getPinAssignment_3()); 

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
    // $ANTLR end "rule__Brick__Group__3__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalArduinoML.g:1036:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1040:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalArduinoML.g:1041:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuator__Group__1();

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
    // $ANTLR end "rule__Actuator__Group__0"


    // $ANTLR start "rule__Actuator__Group__0__Impl"
    // InternalArduinoML.g:1048:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1052:1: ( ( () ) )
            // InternalArduinoML.g:1053:1: ( () )
            {
            // InternalArduinoML.g:1053:1: ( () )
            // InternalArduinoML.g:1054:1: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalArduinoML.g:1055:1: ()
            // InternalArduinoML.g:1057:1: 
            {
            }

             after(grammarAccess.getActuatorAccess().getActuatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0__Impl"


    // $ANTLR start "rule__Actuator__Group__1"
    // InternalArduinoML.g:1067:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1071:1: ( rule__Actuator__Group__1__Impl )
            // InternalArduinoML.g:1072:2: rule__Actuator__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuator__Group__1__Impl();

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
    // $ANTLR end "rule__Actuator__Group__1"


    // $ANTLR start "rule__Actuator__Group__1__Impl"
    // InternalArduinoML.g:1078:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1082:1: ( ( 'Actuator' ) )
            // InternalArduinoML.g:1083:1: ( 'Actuator' )
            {
            // InternalArduinoML.g:1083:1: ( 'Actuator' )
            // InternalArduinoML.g:1084:1: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 

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
    // $ANTLR end "rule__Actuator__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalArduinoML.g:1101:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1105:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalArduinoML.g:1106:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensor__Group__1();

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
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalArduinoML.g:1113:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1117:1: ( ( () ) )
            // InternalArduinoML.g:1118:1: ( () )
            {
            // InternalArduinoML.g:1118:1: ( () )
            // InternalArduinoML.g:1119:1: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalArduinoML.g:1120:1: ()
            // InternalArduinoML.g:1122:1: 
            {
            }

             after(grammarAccess.getSensorAccess().getSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalArduinoML.g:1132:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1136:1: ( rule__Sensor__Group__1__Impl )
            // InternalArduinoML.g:1137:2: rule__Sensor__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensor__Group__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalArduinoML.g:1143:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1147:1: ( ( 'Sensor' ) )
            // InternalArduinoML.g:1148:1: ( 'Sensor' )
            {
            // InternalArduinoML.g:1148:1: ( 'Sensor' )
            // InternalArduinoML.g:1149:1: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_1()); 

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
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalArduinoML.g:1166:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1170:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalArduinoML.g:1171:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalArduinoML.g:1178:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1182:1: ( ( ( '-' )? ) )
            // InternalArduinoML.g:1183:1: ( ( '-' )? )
            {
            // InternalArduinoML.g:1183:1: ( ( '-' )? )
            // InternalArduinoML.g:1184:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalArduinoML.g:1185:1: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalArduinoML.g:1186:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalArduinoML.g:1197:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1201:1: ( rule__EInt__Group__1__Impl )
            // InternalArduinoML.g:1202:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalArduinoML.g:1208:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1212:1: ( ( RULE_INT ) )
            // InternalArduinoML.g:1213:1: ( RULE_INT )
            {
            // InternalArduinoML.g:1213:1: ( RULE_INT )
            // InternalArduinoML.g:1214:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalArduinoML.g:1229:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1233:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalArduinoML.g:1234:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__Group__1();

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
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalArduinoML.g:1241:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1245:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalArduinoML.g:1246:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalArduinoML.g:1246:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalArduinoML.g:1247:1: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalArduinoML.g:1248:1: ( rule__State__NameAssignment_0 )
            // InternalArduinoML.g:1248:2: rule__State__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalArduinoML.g:1258:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1262:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalArduinoML.g:1263:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__Group__2();

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
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalArduinoML.g:1270:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1274:1: ( ( '{' ) )
            // InternalArduinoML.g:1275:1: ( '{' )
            {
            // InternalArduinoML.g:1275:1: ( '{' )
            // InternalArduinoML.g:1276:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalArduinoML.g:1289:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1293:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalArduinoML.g:1294:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__Group__3();

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
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalArduinoML.g:1301:1: rule__State__Group__2__Impl : ( ( rule__State__ErrorsAssignment_2 )* ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1305:1: ( ( ( rule__State__ErrorsAssignment_2 )* ) )
            // InternalArduinoML.g:1306:1: ( ( rule__State__ErrorsAssignment_2 )* )
            {
            // InternalArduinoML.g:1306:1: ( ( rule__State__ErrorsAssignment_2 )* )
            // InternalArduinoML.g:1307:1: ( rule__State__ErrorsAssignment_2 )*
            {
             before(grammarAccess.getStateAccess().getErrorsAssignment_2()); 
            // InternalArduinoML.g:1308:1: ( rule__State__ErrorsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArduinoML.g:1308:2: rule__State__ErrorsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__State__ErrorsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getErrorsAssignment_2()); 

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
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalArduinoML.g:1318:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1322:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalArduinoML.g:1323:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__Group__4();

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
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalArduinoML.g:1330:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 ) ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1334:1: ( ( ( rule__State__ActionsAssignment_3 ) ) )
            // InternalArduinoML.g:1335:1: ( ( rule__State__ActionsAssignment_3 ) )
            {
            // InternalArduinoML.g:1335:1: ( ( rule__State__ActionsAssignment_3 ) )
            // InternalArduinoML.g:1336:1: ( rule__State__ActionsAssignment_3 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalArduinoML.g:1337:1: ( rule__State__ActionsAssignment_3 )
            // InternalArduinoML.g:1337:2: rule__State__ActionsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__ActionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_3()); 

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
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalArduinoML.g:1347:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1351:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalArduinoML.g:1352:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__Group__5();

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
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalArduinoML.g:1359:1: rule__State__Group__4__Impl : ( ( rule__State__ActionsAssignment_4 )* ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1363:1: ( ( ( rule__State__ActionsAssignment_4 )* ) )
            // InternalArduinoML.g:1364:1: ( ( rule__State__ActionsAssignment_4 )* )
            {
            // InternalArduinoML.g:1364:1: ( ( rule__State__ActionsAssignment_4 )* )
            // InternalArduinoML.g:1365:1: ( rule__State__ActionsAssignment_4 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_4()); 
            // InternalArduinoML.g:1366:1: ( rule__State__ActionsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArduinoML.g:1366:2: rule__State__ActionsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__State__ActionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getActionsAssignment_4()); 

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
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalArduinoML.g:1376:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1380:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // InternalArduinoML.g:1381:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__State__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__Group__6();

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
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalArduinoML.g:1388:1: rule__State__Group__5__Impl : ( ( rule__State__TransitionsAssignment_5 ) ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1392:1: ( ( ( rule__State__TransitionsAssignment_5 ) ) )
            // InternalArduinoML.g:1393:1: ( ( rule__State__TransitionsAssignment_5 ) )
            {
            // InternalArduinoML.g:1393:1: ( ( rule__State__TransitionsAssignment_5 ) )
            // InternalArduinoML.g:1394:1: ( rule__State__TransitionsAssignment_5 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_5()); 
            // InternalArduinoML.g:1395:1: ( rule__State__TransitionsAssignment_5 )
            // InternalArduinoML.g:1395:2: rule__State__TransitionsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__TransitionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTransitionsAssignment_5()); 

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
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group__6"
    // InternalArduinoML.g:1405:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1409:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // InternalArduinoML.g:1410:2: rule__State__Group__6__Impl rule__State__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__State__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__Group__7();

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
    // $ANTLR end "rule__State__Group__6"


    // $ANTLR start "rule__State__Group__6__Impl"
    // InternalArduinoML.g:1417:1: rule__State__Group__6__Impl : ( ( rule__State__TransitionsAssignment_6 )* ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1421:1: ( ( ( rule__State__TransitionsAssignment_6 )* ) )
            // InternalArduinoML.g:1422:1: ( ( rule__State__TransitionsAssignment_6 )* )
            {
            // InternalArduinoML.g:1422:1: ( ( rule__State__TransitionsAssignment_6 )* )
            // InternalArduinoML.g:1423:1: ( rule__State__TransitionsAssignment_6 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_6()); 
            // InternalArduinoML.g:1424:1: ( rule__State__TransitionsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArduinoML.g:1424:2: rule__State__TransitionsAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__State__TransitionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_6()); 

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
    // $ANTLR end "rule__State__Group__6__Impl"


    // $ANTLR start "rule__State__Group__7"
    // InternalArduinoML.g:1434:1: rule__State__Group__7 : rule__State__Group__7__Impl ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1438:1: ( rule__State__Group__7__Impl )
            // InternalArduinoML.g:1439:2: rule__State__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__State__Group__7__Impl();

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
    // $ANTLR end "rule__State__Group__7"


    // $ANTLR start "rule__State__Group__7__Impl"
    // InternalArduinoML.g:1445:1: rule__State__Group__7__Impl : ( '}' ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1449:1: ( ( '}' ) )
            // InternalArduinoML.g:1450:1: ( '}' )
            {
            // InternalArduinoML.g:1450:1: ( '}' )
            // InternalArduinoML.g:1451:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__State__Group__7__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalArduinoML.g:1480:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1484:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalArduinoML.g:1485:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalArduinoML.g:1492:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActuatorAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1496:1: ( ( ( rule__Action__ActuatorAssignment_0 ) ) )
            // InternalArduinoML.g:1497:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            {
            // InternalArduinoML.g:1497:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            // InternalArduinoML.g:1498:1: ( rule__Action__ActuatorAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_0()); 
            // InternalArduinoML.g:1499:1: ( rule__Action__ActuatorAssignment_0 )
            // InternalArduinoML.g:1499:2: rule__Action__ActuatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__ActuatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActuatorAssignment_0()); 

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
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalArduinoML.g:1509:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1513:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalArduinoML.g:1514:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__2();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalArduinoML.g:1521:1: rule__Action__Group__1__Impl : ( '<=' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1525:1: ( ( '<=' ) )
            // InternalArduinoML.g:1526:1: ( '<=' )
            {
            // InternalArduinoML.g:1526:1: ( '<=' )
            // InternalArduinoML.g:1527:1: '<='
            {
             before(grammarAccess.getActionAccess().getLessThanSignEqualsSignKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLessThanSignEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalArduinoML.g:1540:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1544:1: ( rule__Action__Group__2__Impl )
            // InternalArduinoML.g:1545:2: rule__Action__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__2__Impl();

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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalArduinoML.g:1551:1: rule__Action__Group__2__Impl : ( ( rule__Action__ValueAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1555:1: ( ( ( rule__Action__ValueAssignment_2 ) ) )
            // InternalArduinoML.g:1556:1: ( ( rule__Action__ValueAssignment_2 ) )
            {
            // InternalArduinoML.g:1556:1: ( ( rule__Action__ValueAssignment_2 ) )
            // InternalArduinoML.g:1557:1: ( rule__Action__ValueAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_2()); 
            // InternalArduinoML.g:1558:1: ( rule__Action__ValueAssignment_2 )
            // InternalArduinoML.g:1558:2: rule__Action__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalArduinoML.g:1574:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1578:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalArduinoML.g:1579:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__1();

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
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalArduinoML.g:1586:1: rule__Transition__Group__0__Impl : ( 'if' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1590:1: ( ( 'if' ) )
            // InternalArduinoML.g:1591:1: ( 'if' )
            {
            // InternalArduinoML.g:1591:1: ( 'if' )
            // InternalArduinoML.g:1592:1: 'if'
            {
             before(grammarAccess.getTransitionAccess().getIfKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalArduinoML.g:1605:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1609:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalArduinoML.g:1610:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__2();

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
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalArduinoML.g:1617:1: rule__Transition__Group__1__Impl : ( '(' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1621:1: ( ( '(' ) )
            // InternalArduinoML.g:1622:1: ( '(' )
            {
            // InternalArduinoML.g:1622:1: ( '(' )
            // InternalArduinoML.g:1623:1: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalArduinoML.g:1636:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1640:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalArduinoML.g:1641:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__3();

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
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalArduinoML.g:1648:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__BaseconditionAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1652:1: ( ( ( rule__Transition__BaseconditionAssignment_2 ) ) )
            // InternalArduinoML.g:1653:1: ( ( rule__Transition__BaseconditionAssignment_2 ) )
            {
            // InternalArduinoML.g:1653:1: ( ( rule__Transition__BaseconditionAssignment_2 ) )
            // InternalArduinoML.g:1654:1: ( rule__Transition__BaseconditionAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getBaseconditionAssignment_2()); 
            // InternalArduinoML.g:1655:1: ( rule__Transition__BaseconditionAssignment_2 )
            // InternalArduinoML.g:1655:2: rule__Transition__BaseconditionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__BaseconditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getBaseconditionAssignment_2()); 

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
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalArduinoML.g:1665:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1669:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalArduinoML.g:1670:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__4();

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
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalArduinoML.g:1677:1: rule__Transition__Group__3__Impl : ( ')' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1681:1: ( ( ')' ) )
            // InternalArduinoML.g:1682:1: ( ')' )
            {
            // InternalArduinoML.g:1682:1: ( ')' )
            // InternalArduinoML.g:1683:1: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalArduinoML.g:1696:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1700:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalArduinoML.g:1701:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__5();

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
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalArduinoML.g:1708:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__BooleanconditionAssignment_4 )* ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1712:1: ( ( ( rule__Transition__BooleanconditionAssignment_4 )* ) )
            // InternalArduinoML.g:1713:1: ( ( rule__Transition__BooleanconditionAssignment_4 )* )
            {
            // InternalArduinoML.g:1713:1: ( ( rule__Transition__BooleanconditionAssignment_4 )* )
            // InternalArduinoML.g:1714:1: ( rule__Transition__BooleanconditionAssignment_4 )*
            {
             before(grammarAccess.getTransitionAccess().getBooleanconditionAssignment_4()); 
            // InternalArduinoML.g:1715:1: ( rule__Transition__BooleanconditionAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=13 && LA11_0<=14)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduinoML.g:1715:2: rule__Transition__BooleanconditionAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__Transition__BooleanconditionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getBooleanconditionAssignment_4()); 

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
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalArduinoML.g:1725:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1729:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalArduinoML.g:1730:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__6();

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
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalArduinoML.g:1737:1: rule__Transition__Group__5__Impl : ( '=>' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1741:1: ( ( '=>' ) )
            // InternalArduinoML.g:1742:1: ( '=>' )
            {
            // InternalArduinoML.g:1742:1: ( '=>' )
            // InternalArduinoML.g:1743:1: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_5()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_5()); 

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
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalArduinoML.g:1756:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1760:1: ( rule__Transition__Group__6__Impl )
            // InternalArduinoML.g:1761:2: rule__Transition__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__6__Impl();

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
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalArduinoML.g:1767:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__NextAssignment_6 ) ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1771:1: ( ( ( rule__Transition__NextAssignment_6 ) ) )
            // InternalArduinoML.g:1772:1: ( ( rule__Transition__NextAssignment_6 ) )
            {
            // InternalArduinoML.g:1772:1: ( ( rule__Transition__NextAssignment_6 ) )
            // InternalArduinoML.g:1773:1: ( rule__Transition__NextAssignment_6 )
            {
             before(grammarAccess.getTransitionAccess().getNextAssignment_6()); 
            // InternalArduinoML.g:1774:1: ( rule__Transition__NextAssignment_6 )
            // InternalArduinoML.g:1774:2: rule__Transition__NextAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__NextAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNextAssignment_6()); 

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
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__BaseCondition__Group__0"
    // InternalArduinoML.g:1798:1: rule__BaseCondition__Group__0 : rule__BaseCondition__Group__0__Impl rule__BaseCondition__Group__1 ;
    public final void rule__BaseCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1802:1: ( rule__BaseCondition__Group__0__Impl rule__BaseCondition__Group__1 )
            // InternalArduinoML.g:1803:2: rule__BaseCondition__Group__0__Impl rule__BaseCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__BaseCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BaseCondition__Group__1();

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
    // $ANTLR end "rule__BaseCondition__Group__0"


    // $ANTLR start "rule__BaseCondition__Group__0__Impl"
    // InternalArduinoML.g:1810:1: rule__BaseCondition__Group__0__Impl : ( ( rule__BaseCondition__SensorAssignment_0 ) ) ;
    public final void rule__BaseCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1814:1: ( ( ( rule__BaseCondition__SensorAssignment_0 ) ) )
            // InternalArduinoML.g:1815:1: ( ( rule__BaseCondition__SensorAssignment_0 ) )
            {
            // InternalArduinoML.g:1815:1: ( ( rule__BaseCondition__SensorAssignment_0 ) )
            // InternalArduinoML.g:1816:1: ( rule__BaseCondition__SensorAssignment_0 )
            {
             before(grammarAccess.getBaseConditionAccess().getSensorAssignment_0()); 
            // InternalArduinoML.g:1817:1: ( rule__BaseCondition__SensorAssignment_0 )
            // InternalArduinoML.g:1817:2: rule__BaseCondition__SensorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BaseCondition__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBaseConditionAccess().getSensorAssignment_0()); 

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
    // $ANTLR end "rule__BaseCondition__Group__0__Impl"


    // $ANTLR start "rule__BaseCondition__Group__1"
    // InternalArduinoML.g:1827:1: rule__BaseCondition__Group__1 : rule__BaseCondition__Group__1__Impl rule__BaseCondition__Group__2 ;
    public final void rule__BaseCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1831:1: ( rule__BaseCondition__Group__1__Impl rule__BaseCondition__Group__2 )
            // InternalArduinoML.g:1832:2: rule__BaseCondition__Group__1__Impl rule__BaseCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__BaseCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BaseCondition__Group__2();

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
    // $ANTLR end "rule__BaseCondition__Group__1"


    // $ANTLR start "rule__BaseCondition__Group__1__Impl"
    // InternalArduinoML.g:1839:1: rule__BaseCondition__Group__1__Impl : ( 'is' ) ;
    public final void rule__BaseCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1843:1: ( ( 'is' ) )
            // InternalArduinoML.g:1844:1: ( 'is' )
            {
            // InternalArduinoML.g:1844:1: ( 'is' )
            // InternalArduinoML.g:1845:1: 'is'
            {
             before(grammarAccess.getBaseConditionAccess().getIsKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBaseConditionAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__BaseCondition__Group__1__Impl"


    // $ANTLR start "rule__BaseCondition__Group__2"
    // InternalArduinoML.g:1858:1: rule__BaseCondition__Group__2 : rule__BaseCondition__Group__2__Impl ;
    public final void rule__BaseCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1862:1: ( rule__BaseCondition__Group__2__Impl )
            // InternalArduinoML.g:1863:2: rule__BaseCondition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BaseCondition__Group__2__Impl();

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
    // $ANTLR end "rule__BaseCondition__Group__2"


    // $ANTLR start "rule__BaseCondition__Group__2__Impl"
    // InternalArduinoML.g:1869:1: rule__BaseCondition__Group__2__Impl : ( ( rule__BaseCondition__ValueAssignment_2 ) ) ;
    public final void rule__BaseCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1873:1: ( ( ( rule__BaseCondition__ValueAssignment_2 ) ) )
            // InternalArduinoML.g:1874:1: ( ( rule__BaseCondition__ValueAssignment_2 ) )
            {
            // InternalArduinoML.g:1874:1: ( ( rule__BaseCondition__ValueAssignment_2 ) )
            // InternalArduinoML.g:1875:1: ( rule__BaseCondition__ValueAssignment_2 )
            {
             before(grammarAccess.getBaseConditionAccess().getValueAssignment_2()); 
            // InternalArduinoML.g:1876:1: ( rule__BaseCondition__ValueAssignment_2 )
            // InternalArduinoML.g:1876:2: rule__BaseCondition__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BaseCondition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseConditionAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__BaseCondition__Group__2__Impl"


    // $ANTLR start "rule__BooleanCondition__Group__0"
    // InternalArduinoML.g:1892:1: rule__BooleanCondition__Group__0 : rule__BooleanCondition__Group__0__Impl rule__BooleanCondition__Group__1 ;
    public final void rule__BooleanCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1896:1: ( rule__BooleanCondition__Group__0__Impl rule__BooleanCondition__Group__1 )
            // InternalArduinoML.g:1897:2: rule__BooleanCondition__Group__0__Impl rule__BooleanCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__BooleanCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanCondition__Group__1();

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
    // $ANTLR end "rule__BooleanCondition__Group__0"


    // $ANTLR start "rule__BooleanCondition__Group__0__Impl"
    // InternalArduinoML.g:1904:1: rule__BooleanCondition__Group__0__Impl : ( ( rule__BooleanCondition__OperatorAssignment_0 ) ) ;
    public final void rule__BooleanCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1908:1: ( ( ( rule__BooleanCondition__OperatorAssignment_0 ) ) )
            // InternalArduinoML.g:1909:1: ( ( rule__BooleanCondition__OperatorAssignment_0 ) )
            {
            // InternalArduinoML.g:1909:1: ( ( rule__BooleanCondition__OperatorAssignment_0 ) )
            // InternalArduinoML.g:1910:1: ( rule__BooleanCondition__OperatorAssignment_0 )
            {
             before(grammarAccess.getBooleanConditionAccess().getOperatorAssignment_0()); 
            // InternalArduinoML.g:1911:1: ( rule__BooleanCondition__OperatorAssignment_0 )
            // InternalArduinoML.g:1911:2: rule__BooleanCondition__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanCondition__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConditionAccess().getOperatorAssignment_0()); 

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
    // $ANTLR end "rule__BooleanCondition__Group__0__Impl"


    // $ANTLR start "rule__BooleanCondition__Group__1"
    // InternalArduinoML.g:1921:1: rule__BooleanCondition__Group__1 : rule__BooleanCondition__Group__1__Impl rule__BooleanCondition__Group__2 ;
    public final void rule__BooleanCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1925:1: ( rule__BooleanCondition__Group__1__Impl rule__BooleanCondition__Group__2 )
            // InternalArduinoML.g:1926:2: rule__BooleanCondition__Group__1__Impl rule__BooleanCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__BooleanCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanCondition__Group__2();

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
    // $ANTLR end "rule__BooleanCondition__Group__1"


    // $ANTLR start "rule__BooleanCondition__Group__1__Impl"
    // InternalArduinoML.g:1933:1: rule__BooleanCondition__Group__1__Impl : ( '(' ) ;
    public final void rule__BooleanCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1937:1: ( ( '(' ) )
            // InternalArduinoML.g:1938:1: ( '(' )
            {
            // InternalArduinoML.g:1938:1: ( '(' )
            // InternalArduinoML.g:1939:1: '('
            {
             before(grammarAccess.getBooleanConditionAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBooleanConditionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__BooleanCondition__Group__1__Impl"


    // $ANTLR start "rule__BooleanCondition__Group__2"
    // InternalArduinoML.g:1952:1: rule__BooleanCondition__Group__2 : rule__BooleanCondition__Group__2__Impl rule__BooleanCondition__Group__3 ;
    public final void rule__BooleanCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1956:1: ( rule__BooleanCondition__Group__2__Impl rule__BooleanCondition__Group__3 )
            // InternalArduinoML.g:1957:2: rule__BooleanCondition__Group__2__Impl rule__BooleanCondition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__BooleanCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanCondition__Group__3();

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
    // $ANTLR end "rule__BooleanCondition__Group__2"


    // $ANTLR start "rule__BooleanCondition__Group__2__Impl"
    // InternalArduinoML.g:1964:1: rule__BooleanCondition__Group__2__Impl : ( ( rule__BooleanCondition__SensorAssignment_2 ) ) ;
    public final void rule__BooleanCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1968:1: ( ( ( rule__BooleanCondition__SensorAssignment_2 ) ) )
            // InternalArduinoML.g:1969:1: ( ( rule__BooleanCondition__SensorAssignment_2 ) )
            {
            // InternalArduinoML.g:1969:1: ( ( rule__BooleanCondition__SensorAssignment_2 ) )
            // InternalArduinoML.g:1970:1: ( rule__BooleanCondition__SensorAssignment_2 )
            {
             before(grammarAccess.getBooleanConditionAccess().getSensorAssignment_2()); 
            // InternalArduinoML.g:1971:1: ( rule__BooleanCondition__SensorAssignment_2 )
            // InternalArduinoML.g:1971:2: rule__BooleanCondition__SensorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanCondition__SensorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConditionAccess().getSensorAssignment_2()); 

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
    // $ANTLR end "rule__BooleanCondition__Group__2__Impl"


    // $ANTLR start "rule__BooleanCondition__Group__3"
    // InternalArduinoML.g:1981:1: rule__BooleanCondition__Group__3 : rule__BooleanCondition__Group__3__Impl rule__BooleanCondition__Group__4 ;
    public final void rule__BooleanCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1985:1: ( rule__BooleanCondition__Group__3__Impl rule__BooleanCondition__Group__4 )
            // InternalArduinoML.g:1986:2: rule__BooleanCondition__Group__3__Impl rule__BooleanCondition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__BooleanCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanCondition__Group__4();

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
    // $ANTLR end "rule__BooleanCondition__Group__3"


    // $ANTLR start "rule__BooleanCondition__Group__3__Impl"
    // InternalArduinoML.g:1993:1: rule__BooleanCondition__Group__3__Impl : ( 'is' ) ;
    public final void rule__BooleanCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:1997:1: ( ( 'is' ) )
            // InternalArduinoML.g:1998:1: ( 'is' )
            {
            // InternalArduinoML.g:1998:1: ( 'is' )
            // InternalArduinoML.g:1999:1: 'is'
            {
             before(grammarAccess.getBooleanConditionAccess().getIsKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBooleanConditionAccess().getIsKeyword_3()); 

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
    // $ANTLR end "rule__BooleanCondition__Group__3__Impl"


    // $ANTLR start "rule__BooleanCondition__Group__4"
    // InternalArduinoML.g:2012:1: rule__BooleanCondition__Group__4 : rule__BooleanCondition__Group__4__Impl rule__BooleanCondition__Group__5 ;
    public final void rule__BooleanCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2016:1: ( rule__BooleanCondition__Group__4__Impl rule__BooleanCondition__Group__5 )
            // InternalArduinoML.g:2017:2: rule__BooleanCondition__Group__4__Impl rule__BooleanCondition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__BooleanCondition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanCondition__Group__5();

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
    // $ANTLR end "rule__BooleanCondition__Group__4"


    // $ANTLR start "rule__BooleanCondition__Group__4__Impl"
    // InternalArduinoML.g:2024:1: rule__BooleanCondition__Group__4__Impl : ( ( rule__BooleanCondition__ValueAssignment_4 ) ) ;
    public final void rule__BooleanCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2028:1: ( ( ( rule__BooleanCondition__ValueAssignment_4 ) ) )
            // InternalArduinoML.g:2029:1: ( ( rule__BooleanCondition__ValueAssignment_4 ) )
            {
            // InternalArduinoML.g:2029:1: ( ( rule__BooleanCondition__ValueAssignment_4 ) )
            // InternalArduinoML.g:2030:1: ( rule__BooleanCondition__ValueAssignment_4 )
            {
             before(grammarAccess.getBooleanConditionAccess().getValueAssignment_4()); 
            // InternalArduinoML.g:2031:1: ( rule__BooleanCondition__ValueAssignment_4 )
            // InternalArduinoML.g:2031:2: rule__BooleanCondition__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanCondition__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConditionAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__BooleanCondition__Group__4__Impl"


    // $ANTLR start "rule__BooleanCondition__Group__5"
    // InternalArduinoML.g:2041:1: rule__BooleanCondition__Group__5 : rule__BooleanCondition__Group__5__Impl ;
    public final void rule__BooleanCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2045:1: ( rule__BooleanCondition__Group__5__Impl )
            // InternalArduinoML.g:2046:2: rule__BooleanCondition__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanCondition__Group__5__Impl();

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
    // $ANTLR end "rule__BooleanCondition__Group__5"


    // $ANTLR start "rule__BooleanCondition__Group__5__Impl"
    // InternalArduinoML.g:2052:1: rule__BooleanCondition__Group__5__Impl : ( ')' ) ;
    public final void rule__BooleanCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2056:1: ( ( ')' ) )
            // InternalArduinoML.g:2057:1: ( ')' )
            {
            // InternalArduinoML.g:2057:1: ( ')' )
            // InternalArduinoML.g:2058:1: ')'
            {
             before(grammarAccess.getBooleanConditionAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBooleanConditionAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__BooleanCondition__Group__5__Impl"


    // $ANTLR start "rule__SinkError__Group__0"
    // InternalArduinoML.g:2083:1: rule__SinkError__Group__0 : rule__SinkError__Group__0__Impl rule__SinkError__Group__1 ;
    public final void rule__SinkError__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2087:1: ( rule__SinkError__Group__0__Impl rule__SinkError__Group__1 )
            // InternalArduinoML.g:2088:2: rule__SinkError__Group__0__Impl rule__SinkError__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__SinkError__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SinkError__Group__1();

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
    // $ANTLR end "rule__SinkError__Group__0"


    // $ANTLR start "rule__SinkError__Group__0__Impl"
    // InternalArduinoML.g:2095:1: rule__SinkError__Group__0__Impl : ( 'if' ) ;
    public final void rule__SinkError__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2099:1: ( ( 'if' ) )
            // InternalArduinoML.g:2100:1: ( 'if' )
            {
            // InternalArduinoML.g:2100:1: ( 'if' )
            // InternalArduinoML.g:2101:1: 'if'
            {
             before(grammarAccess.getSinkErrorAccess().getIfKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSinkErrorAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__SinkError__Group__0__Impl"


    // $ANTLR start "rule__SinkError__Group__1"
    // InternalArduinoML.g:2114:1: rule__SinkError__Group__1 : rule__SinkError__Group__1__Impl rule__SinkError__Group__2 ;
    public final void rule__SinkError__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2118:1: ( rule__SinkError__Group__1__Impl rule__SinkError__Group__2 )
            // InternalArduinoML.g:2119:2: rule__SinkError__Group__1__Impl rule__SinkError__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__SinkError__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SinkError__Group__2();

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
    // $ANTLR end "rule__SinkError__Group__1"


    // $ANTLR start "rule__SinkError__Group__1__Impl"
    // InternalArduinoML.g:2126:1: rule__SinkError__Group__1__Impl : ( '(' ) ;
    public final void rule__SinkError__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2130:1: ( ( '(' ) )
            // InternalArduinoML.g:2131:1: ( '(' )
            {
            // InternalArduinoML.g:2131:1: ( '(' )
            // InternalArduinoML.g:2132:1: '('
            {
             before(grammarAccess.getSinkErrorAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSinkErrorAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SinkError__Group__1__Impl"


    // $ANTLR start "rule__SinkError__Group__2"
    // InternalArduinoML.g:2145:1: rule__SinkError__Group__2 : rule__SinkError__Group__2__Impl rule__SinkError__Group__3 ;
    public final void rule__SinkError__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2149:1: ( rule__SinkError__Group__2__Impl rule__SinkError__Group__3 )
            // InternalArduinoML.g:2150:2: rule__SinkError__Group__2__Impl rule__SinkError__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__SinkError__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SinkError__Group__3();

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
    // $ANTLR end "rule__SinkError__Group__2"


    // $ANTLR start "rule__SinkError__Group__2__Impl"
    // InternalArduinoML.g:2157:1: rule__SinkError__Group__2__Impl : ( ( rule__SinkError__BaseconditionAssignment_2 ) ) ;
    public final void rule__SinkError__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2161:1: ( ( ( rule__SinkError__BaseconditionAssignment_2 ) ) )
            // InternalArduinoML.g:2162:1: ( ( rule__SinkError__BaseconditionAssignment_2 ) )
            {
            // InternalArduinoML.g:2162:1: ( ( rule__SinkError__BaseconditionAssignment_2 ) )
            // InternalArduinoML.g:2163:1: ( rule__SinkError__BaseconditionAssignment_2 )
            {
             before(grammarAccess.getSinkErrorAccess().getBaseconditionAssignment_2()); 
            // InternalArduinoML.g:2164:1: ( rule__SinkError__BaseconditionAssignment_2 )
            // InternalArduinoML.g:2164:2: rule__SinkError__BaseconditionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SinkError__BaseconditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSinkErrorAccess().getBaseconditionAssignment_2()); 

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
    // $ANTLR end "rule__SinkError__Group__2__Impl"


    // $ANTLR start "rule__SinkError__Group__3"
    // InternalArduinoML.g:2174:1: rule__SinkError__Group__3 : rule__SinkError__Group__3__Impl rule__SinkError__Group__4 ;
    public final void rule__SinkError__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2178:1: ( rule__SinkError__Group__3__Impl rule__SinkError__Group__4 )
            // InternalArduinoML.g:2179:2: rule__SinkError__Group__3__Impl rule__SinkError__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__SinkError__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SinkError__Group__4();

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
    // $ANTLR end "rule__SinkError__Group__3"


    // $ANTLR start "rule__SinkError__Group__3__Impl"
    // InternalArduinoML.g:2186:1: rule__SinkError__Group__3__Impl : ( ')' ) ;
    public final void rule__SinkError__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2190:1: ( ( ')' ) )
            // InternalArduinoML.g:2191:1: ( ')' )
            {
            // InternalArduinoML.g:2191:1: ( ')' )
            // InternalArduinoML.g:2192:1: ')'
            {
             before(grammarAccess.getSinkErrorAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSinkErrorAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__SinkError__Group__3__Impl"


    // $ANTLR start "rule__SinkError__Group__4"
    // InternalArduinoML.g:2205:1: rule__SinkError__Group__4 : rule__SinkError__Group__4__Impl rule__SinkError__Group__5 ;
    public final void rule__SinkError__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2209:1: ( rule__SinkError__Group__4__Impl rule__SinkError__Group__5 )
            // InternalArduinoML.g:2210:2: rule__SinkError__Group__4__Impl rule__SinkError__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__SinkError__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SinkError__Group__5();

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
    // $ANTLR end "rule__SinkError__Group__4"


    // $ANTLR start "rule__SinkError__Group__4__Impl"
    // InternalArduinoML.g:2217:1: rule__SinkError__Group__4__Impl : ( ( rule__SinkError__BooleanconditionAssignment_4 )* ) ;
    public final void rule__SinkError__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2221:1: ( ( ( rule__SinkError__BooleanconditionAssignment_4 )* ) )
            // InternalArduinoML.g:2222:1: ( ( rule__SinkError__BooleanconditionAssignment_4 )* )
            {
            // InternalArduinoML.g:2222:1: ( ( rule__SinkError__BooleanconditionAssignment_4 )* )
            // InternalArduinoML.g:2223:1: ( rule__SinkError__BooleanconditionAssignment_4 )*
            {
             before(grammarAccess.getSinkErrorAccess().getBooleanconditionAssignment_4()); 
            // InternalArduinoML.g:2224:1: ( rule__SinkError__BooleanconditionAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArduinoML.g:2224:2: rule__SinkError__BooleanconditionAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__SinkError__BooleanconditionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSinkErrorAccess().getBooleanconditionAssignment_4()); 

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
    // $ANTLR end "rule__SinkError__Group__4__Impl"


    // $ANTLR start "rule__SinkError__Group__5"
    // InternalArduinoML.g:2234:1: rule__SinkError__Group__5 : rule__SinkError__Group__5__Impl rule__SinkError__Group__6 ;
    public final void rule__SinkError__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2238:1: ( rule__SinkError__Group__5__Impl rule__SinkError__Group__6 )
            // InternalArduinoML.g:2239:2: rule__SinkError__Group__5__Impl rule__SinkError__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__SinkError__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SinkError__Group__6();

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
    // $ANTLR end "rule__SinkError__Group__5"


    // $ANTLR start "rule__SinkError__Group__5__Impl"
    // InternalArduinoML.g:2246:1: rule__SinkError__Group__5__Impl : ( '=>' ) ;
    public final void rule__SinkError__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2250:1: ( ( '=>' ) )
            // InternalArduinoML.g:2251:1: ( '=>' )
            {
            // InternalArduinoML.g:2251:1: ( '=>' )
            // InternalArduinoML.g:2252:1: '=>'
            {
             before(grammarAccess.getSinkErrorAccess().getEqualsSignGreaterThanSignKeyword_5()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSinkErrorAccess().getEqualsSignGreaterThanSignKeyword_5()); 

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
    // $ANTLR end "rule__SinkError__Group__5__Impl"


    // $ANTLR start "rule__SinkError__Group__6"
    // InternalArduinoML.g:2265:1: rule__SinkError__Group__6 : rule__SinkError__Group__6__Impl rule__SinkError__Group__7 ;
    public final void rule__SinkError__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2269:1: ( rule__SinkError__Group__6__Impl rule__SinkError__Group__7 )
            // InternalArduinoML.g:2270:2: rule__SinkError__Group__6__Impl rule__SinkError__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__SinkError__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SinkError__Group__7();

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
    // $ANTLR end "rule__SinkError__Group__6"


    // $ANTLR start "rule__SinkError__Group__6__Impl"
    // InternalArduinoML.g:2277:1: rule__SinkError__Group__6__Impl : ( 'error' ) ;
    public final void rule__SinkError__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2281:1: ( ( 'error' ) )
            // InternalArduinoML.g:2282:1: ( 'error' )
            {
            // InternalArduinoML.g:2282:1: ( 'error' )
            // InternalArduinoML.g:2283:1: 'error'
            {
             before(grammarAccess.getSinkErrorAccess().getErrorKeyword_6()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSinkErrorAccess().getErrorKeyword_6()); 

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
    // $ANTLR end "rule__SinkError__Group__6__Impl"


    // $ANTLR start "rule__SinkError__Group__7"
    // InternalArduinoML.g:2296:1: rule__SinkError__Group__7 : rule__SinkError__Group__7__Impl ;
    public final void rule__SinkError__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2300:1: ( rule__SinkError__Group__7__Impl )
            // InternalArduinoML.g:2301:2: rule__SinkError__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SinkError__Group__7__Impl();

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
    // $ANTLR end "rule__SinkError__Group__7"


    // $ANTLR start "rule__SinkError__Group__7__Impl"
    // InternalArduinoML.g:2307:1: rule__SinkError__Group__7__Impl : ( ( rule__SinkError__ValueAssignment_7 ) ) ;
    public final void rule__SinkError__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2311:1: ( ( ( rule__SinkError__ValueAssignment_7 ) ) )
            // InternalArduinoML.g:2312:1: ( ( rule__SinkError__ValueAssignment_7 ) )
            {
            // InternalArduinoML.g:2312:1: ( ( rule__SinkError__ValueAssignment_7 ) )
            // InternalArduinoML.g:2313:1: ( rule__SinkError__ValueAssignment_7 )
            {
             before(grammarAccess.getSinkErrorAccess().getValueAssignment_7()); 
            // InternalArduinoML.g:2314:1: ( rule__SinkError__ValueAssignment_7 )
            // InternalArduinoML.g:2314:2: rule__SinkError__ValueAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SinkError__ValueAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSinkErrorAccess().getValueAssignment_7()); 

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
    // $ANTLR end "rule__SinkError__Group__7__Impl"


    // $ANTLR start "rule__App__NameAssignment_1"
    // InternalArduinoML.g:2341:1: rule__App__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__App__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2345:1: ( ( ruleEString ) )
            // InternalArduinoML.g:2346:1: ( ruleEString )
            {
            // InternalArduinoML.g:2346:1: ( ruleEString )
            // InternalArduinoML.g:2347:1: ruleEString
            {
             before(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__App__NameAssignment_1"


    // $ANTLR start "rule__App__InitialAssignment_3"
    // InternalArduinoML.g:2356:1: rule__App__InitialAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__App__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2360:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:2361:1: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:2361:1: ( ( ruleEString ) )
            // InternalArduinoML.g:2362:1: ( ruleEString )
            {
             before(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0()); 
            // InternalArduinoML.g:2363:1: ( ruleEString )
            // InternalArduinoML.g:2364:1: ruleEString
            {
             before(grammarAccess.getAppAccess().getInitialStateEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getInitialStateEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0()); 

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
    // $ANTLR end "rule__App__InitialAssignment_3"


    // $ANTLR start "rule__App__BricksAssignment_6"
    // InternalArduinoML.g:2375:1: rule__App__BricksAssignment_6 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2379:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:2380:1: ( ruleBrick )
            {
            // InternalArduinoML.g:2380:1: ( ruleBrick )
            // InternalArduinoML.g:2381:1: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__App__BricksAssignment_6"


    // $ANTLR start "rule__App__BricksAssignment_7"
    // InternalArduinoML.g:2390:1: rule__App__BricksAssignment_7 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2394:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:2395:1: ( ruleBrick )
            {
            // InternalArduinoML.g:2395:1: ( ruleBrick )
            // InternalArduinoML.g:2396:1: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__App__BricksAssignment_7"


    // $ANTLR start "rule__App__StatesAssignment_9"
    // InternalArduinoML.g:2405:1: rule__App__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2409:1: ( ( ruleState ) )
            // InternalArduinoML.g:2410:1: ( ruleState )
            {
            // InternalArduinoML.g:2410:1: ( ruleState )
            // InternalArduinoML.g:2411:1: ruleState
            {
             before(grammarAccess.getAppAccess().getStatesStateParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAppAccess().getStatesStateParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__App__StatesAssignment_9"


    // $ANTLR start "rule__App__StatesAssignment_10"
    // InternalArduinoML.g:2420:1: rule__App__StatesAssignment_10 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2424:1: ( ( ruleState ) )
            // InternalArduinoML.g:2425:1: ( ruleState )
            {
            // InternalArduinoML.g:2425:1: ( ruleState )
            // InternalArduinoML.g:2426:1: ruleState
            {
             before(grammarAccess.getAppAccess().getStatesStateParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAppAccess().getStatesStateParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__App__StatesAssignment_10"


    // $ANTLR start "rule__Brick__NameAssignment_1"
    // InternalArduinoML.g:2435:1: rule__Brick__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Brick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2439:1: ( ( ruleEString ) )
            // InternalArduinoML.g:2440:1: ( ruleEString )
            {
            // InternalArduinoML.g:2440:1: ( ruleEString )
            // InternalArduinoML.g:2441:1: ruleEString
            {
             before(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Brick__NameAssignment_1"


    // $ANTLR start "rule__Brick__PinAssignment_3"
    // InternalArduinoML.g:2450:1: rule__Brick__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__Brick__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2454:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:2455:1: ( ruleEInt )
            {
            // InternalArduinoML.g:2455:1: ( ruleEInt )
            // InternalArduinoML.g:2456:1: ruleEInt
            {
             before(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Brick__PinAssignment_3"


    // $ANTLR start "rule__State__NameAssignment_0"
    // InternalArduinoML.g:2465:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2469:1: ( ( ruleEString ) )
            // InternalArduinoML.g:2470:1: ( ruleEString )
            {
            // InternalArduinoML.g:2470:1: ( ruleEString )
            // InternalArduinoML.g:2471:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__State__NameAssignment_0"


    // $ANTLR start "rule__State__ErrorsAssignment_2"
    // InternalArduinoML.g:2480:1: rule__State__ErrorsAssignment_2 : ( ruleSinkError ) ;
    public final void rule__State__ErrorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2484:1: ( ( ruleSinkError ) )
            // InternalArduinoML.g:2485:1: ( ruleSinkError )
            {
            // InternalArduinoML.g:2485:1: ( ruleSinkError )
            // InternalArduinoML.g:2486:1: ruleSinkError
            {
             before(grammarAccess.getStateAccess().getErrorsSinkErrorParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSinkError();

            state._fsp--;

             after(grammarAccess.getStateAccess().getErrorsSinkErrorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__State__ErrorsAssignment_2"


    // $ANTLR start "rule__State__ActionsAssignment_3"
    // InternalArduinoML.g:2495:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2499:1: ( ( ruleAction ) )
            // InternalArduinoML.g:2500:1: ( ruleAction )
            {
            // InternalArduinoML.g:2500:1: ( ruleAction )
            // InternalArduinoML.g:2501:1: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__State__ActionsAssignment_3"


    // $ANTLR start "rule__State__ActionsAssignment_4"
    // InternalArduinoML.g:2510:1: rule__State__ActionsAssignment_4 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2514:1: ( ( ruleAction ) )
            // InternalArduinoML.g:2515:1: ( ruleAction )
            {
            // InternalArduinoML.g:2515:1: ( ruleAction )
            // InternalArduinoML.g:2516:1: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__State__ActionsAssignment_4"


    // $ANTLR start "rule__State__TransitionsAssignment_5"
    // InternalArduinoML.g:2525:1: rule__State__TransitionsAssignment_5 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2529:1: ( ( ruleTransition ) )
            // InternalArduinoML.g:2530:1: ( ruleTransition )
            {
            // InternalArduinoML.g:2530:1: ( ruleTransition )
            // InternalArduinoML.g:2531:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__State__TransitionsAssignment_5"


    // $ANTLR start "rule__State__TransitionsAssignment_6"
    // InternalArduinoML.g:2540:1: rule__State__TransitionsAssignment_6 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2544:1: ( ( ruleTransition ) )
            // InternalArduinoML.g:2545:1: ( ruleTransition )
            {
            // InternalArduinoML.g:2545:1: ( ruleTransition )
            // InternalArduinoML.g:2546:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__State__TransitionsAssignment_6"


    // $ANTLR start "rule__Action__ActuatorAssignment_0"
    // InternalArduinoML.g:2555:1: rule__Action__ActuatorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2559:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:2560:1: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:2560:1: ( ( ruleEString ) )
            // InternalArduinoML.g:2561:1: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
            // InternalArduinoML.g:2562:1: ( ruleEString )
            // InternalArduinoML.g:2563:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActuatorActuatorEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 

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
    // $ANTLR end "rule__Action__ActuatorAssignment_0"


    // $ANTLR start "rule__Action__ValueAssignment_2"
    // InternalArduinoML.g:2574:1: rule__Action__ValueAssignment_2 : ( ruleSignal ) ;
    public final void rule__Action__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2578:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:2579:1: ( ruleSignal )
            {
            // InternalArduinoML.g:2579:1: ( ruleSignal )
            // InternalArduinoML.g:2580:1: ruleSignal
            {
             before(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Action__ValueAssignment_2"


    // $ANTLR start "rule__Transition__BaseconditionAssignment_2"
    // InternalArduinoML.g:2589:1: rule__Transition__BaseconditionAssignment_2 : ( ruleBaseCondition ) ;
    public final void rule__Transition__BaseconditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2593:1: ( ( ruleBaseCondition ) )
            // InternalArduinoML.g:2594:1: ( ruleBaseCondition )
            {
            // InternalArduinoML.g:2594:1: ( ruleBaseCondition )
            // InternalArduinoML.g:2595:1: ruleBaseCondition
            {
             before(grammarAccess.getTransitionAccess().getBaseconditionBaseConditionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBaseCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getBaseconditionBaseConditionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Transition__BaseconditionAssignment_2"


    // $ANTLR start "rule__Transition__BooleanconditionAssignment_4"
    // InternalArduinoML.g:2604:1: rule__Transition__BooleanconditionAssignment_4 : ( ruleBooleanCondition ) ;
    public final void rule__Transition__BooleanconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2608:1: ( ( ruleBooleanCondition ) )
            // InternalArduinoML.g:2609:1: ( ruleBooleanCondition )
            {
            // InternalArduinoML.g:2609:1: ( ruleBooleanCondition )
            // InternalArduinoML.g:2610:1: ruleBooleanCondition
            {
             before(grammarAccess.getTransitionAccess().getBooleanconditionBooleanConditionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBooleanCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getBooleanconditionBooleanConditionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Transition__BooleanconditionAssignment_4"


    // $ANTLR start "rule__Transition__NextAssignment_6"
    // InternalArduinoML.g:2619:1: rule__Transition__NextAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2623:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:2624:1: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:2624:1: ( ( ruleEString ) )
            // InternalArduinoML.g:2625:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateCrossReference_6_0()); 
            // InternalArduinoML.g:2626:1: ( ruleEString )
            // InternalArduinoML.g:2627:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getNextStateCrossReference_6_0()); 

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
    // $ANTLR end "rule__Transition__NextAssignment_6"


    // $ANTLR start "rule__BaseCondition__SensorAssignment_0"
    // InternalArduinoML.g:2638:1: rule__BaseCondition__SensorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__BaseCondition__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2642:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:2643:1: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:2643:1: ( ( ruleEString ) )
            // InternalArduinoML.g:2644:1: ( ruleEString )
            {
             before(grammarAccess.getBaseConditionAccess().getSensorSensorCrossReference_0_0()); 
            // InternalArduinoML.g:2645:1: ( ruleEString )
            // InternalArduinoML.g:2646:1: ruleEString
            {
             before(grammarAccess.getBaseConditionAccess().getSensorSensorEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseConditionAccess().getSensorSensorEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBaseConditionAccess().getSensorSensorCrossReference_0_0()); 

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
    // $ANTLR end "rule__BaseCondition__SensorAssignment_0"


    // $ANTLR start "rule__BaseCondition__ValueAssignment_2"
    // InternalArduinoML.g:2657:1: rule__BaseCondition__ValueAssignment_2 : ( ruleSignal ) ;
    public final void rule__BaseCondition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2661:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:2662:1: ( ruleSignal )
            {
            // InternalArduinoML.g:2662:1: ( ruleSignal )
            // InternalArduinoML.g:2663:1: ruleSignal
            {
             before(grammarAccess.getBaseConditionAccess().getValueSignalEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getBaseConditionAccess().getValueSignalEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__BaseCondition__ValueAssignment_2"


    // $ANTLR start "rule__BooleanCondition__OperatorAssignment_0"
    // InternalArduinoML.g:2672:1: rule__BooleanCondition__OperatorAssignment_0 : ( ruleOperator ) ;
    public final void rule__BooleanCondition__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2676:1: ( ( ruleOperator ) )
            // InternalArduinoML.g:2677:1: ( ruleOperator )
            {
            // InternalArduinoML.g:2677:1: ( ruleOperator )
            // InternalArduinoML.g:2678:1: ruleOperator
            {
             before(grammarAccess.getBooleanConditionAccess().getOperatorOperatorEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getBooleanConditionAccess().getOperatorOperatorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__BooleanCondition__OperatorAssignment_0"


    // $ANTLR start "rule__BooleanCondition__SensorAssignment_2"
    // InternalArduinoML.g:2687:1: rule__BooleanCondition__SensorAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__BooleanCondition__SensorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2691:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:2692:1: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:2692:1: ( ( ruleEString ) )
            // InternalArduinoML.g:2693:1: ( ruleEString )
            {
             before(grammarAccess.getBooleanConditionAccess().getSensorSensorCrossReference_2_0()); 
            // InternalArduinoML.g:2694:1: ( ruleEString )
            // InternalArduinoML.g:2695:1: ruleEString
            {
             before(grammarAccess.getBooleanConditionAccess().getSensorSensorEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanConditionAccess().getSensorSensorEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBooleanConditionAccess().getSensorSensorCrossReference_2_0()); 

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
    // $ANTLR end "rule__BooleanCondition__SensorAssignment_2"


    // $ANTLR start "rule__BooleanCondition__ValueAssignment_4"
    // InternalArduinoML.g:2706:1: rule__BooleanCondition__ValueAssignment_4 : ( ruleSignal ) ;
    public final void rule__BooleanCondition__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2710:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:2711:1: ( ruleSignal )
            {
            // InternalArduinoML.g:2711:1: ( ruleSignal )
            // InternalArduinoML.g:2712:1: ruleSignal
            {
             before(grammarAccess.getBooleanConditionAccess().getValueSignalEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getBooleanConditionAccess().getValueSignalEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__BooleanCondition__ValueAssignment_4"


    // $ANTLR start "rule__SinkError__BaseconditionAssignment_2"
    // InternalArduinoML.g:2721:1: rule__SinkError__BaseconditionAssignment_2 : ( ruleBaseCondition ) ;
    public final void rule__SinkError__BaseconditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2725:1: ( ( ruleBaseCondition ) )
            // InternalArduinoML.g:2726:1: ( ruleBaseCondition )
            {
            // InternalArduinoML.g:2726:1: ( ruleBaseCondition )
            // InternalArduinoML.g:2727:1: ruleBaseCondition
            {
             before(grammarAccess.getSinkErrorAccess().getBaseconditionBaseConditionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBaseCondition();

            state._fsp--;

             after(grammarAccess.getSinkErrorAccess().getBaseconditionBaseConditionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SinkError__BaseconditionAssignment_2"


    // $ANTLR start "rule__SinkError__BooleanconditionAssignment_4"
    // InternalArduinoML.g:2736:1: rule__SinkError__BooleanconditionAssignment_4 : ( ruleBooleanCondition ) ;
    public final void rule__SinkError__BooleanconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2740:1: ( ( ruleBooleanCondition ) )
            // InternalArduinoML.g:2741:1: ( ruleBooleanCondition )
            {
            // InternalArduinoML.g:2741:1: ( ruleBooleanCondition )
            // InternalArduinoML.g:2742:1: ruleBooleanCondition
            {
             before(grammarAccess.getSinkErrorAccess().getBooleanconditionBooleanConditionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBooleanCondition();

            state._fsp--;

             after(grammarAccess.getSinkErrorAccess().getBooleanconditionBooleanConditionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SinkError__BooleanconditionAssignment_4"


    // $ANTLR start "rule__SinkError__ValueAssignment_7"
    // InternalArduinoML.g:2751:1: rule__SinkError__ValueAssignment_7 : ( ruleEInt ) ;
    public final void rule__SinkError__ValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalArduinoML.g:2755:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:2756:1: ( ruleEInt )
            {
            // InternalArduinoML.g:2756:1: ( ruleEInt )
            // InternalArduinoML.g:2757:1: ruleEInt
            {
             before(grammarAccess.getSinkErrorAccess().getValueEIntParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSinkErrorAccess().getValueEIntParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__SinkError__ValueAssignment_7"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000C80000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000030L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000032L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004100030L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020006000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    }


}