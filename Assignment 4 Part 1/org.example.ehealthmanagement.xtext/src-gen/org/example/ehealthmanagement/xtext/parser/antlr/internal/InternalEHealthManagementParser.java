package org.example.ehealthmanagement.xtext.parser.antlr.internal;

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
import org.example.ehealthmanagement.xtext.services.EHealthManagementGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEHealthManagementParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'User'", "'{'", "'UserTypes'", "'}'", "'Doctor'", "'Patient'", "'SystemAdmin'", "'ProfileView'", "'InformationView'", "'DoctorProfile'", "'PatientProfile'", "'MedicineList'", "'PrescriptionView'", "'DiagnosysView'", "'CommunicationView'", "'NotificationView'", "'FeedbackView'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEHealthManagementParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEHealthManagementParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEHealthManagementParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEHealthManagement.g"; }



     	private EHealthManagementGrammarAccess grammarAccess;

        public InternalEHealthManagementParser(TokenStream input, EHealthManagementGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "User";
       	}

       	@Override
       	protected EHealthManagementGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUser"
    // InternalEHealthManagement.g:65:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalEHealthManagement.g:65:45: (iv_ruleUser= ruleUser EOF )
            // InternalEHealthManagement.g:66:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalEHealthManagement.g:72:1: ruleUser returns [EObject current=null] : ( () otherlv_1= 'User' otherlv_2= '{' (otherlv_3= 'UserTypes' ( (lv_UserTypes_4_0= ruleAllowedUserTypes ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_UserTypes_4_0 = null;



        	enterRule();

        try {
            // InternalEHealthManagement.g:78:2: ( ( () otherlv_1= 'User' otherlv_2= '{' (otherlv_3= 'UserTypes' ( (lv_UserTypes_4_0= ruleAllowedUserTypes ) ) )? otherlv_5= '}' ) )
            // InternalEHealthManagement.g:79:2: ( () otherlv_1= 'User' otherlv_2= '{' (otherlv_3= 'UserTypes' ( (lv_UserTypes_4_0= ruleAllowedUserTypes ) ) )? otherlv_5= '}' )
            {
            // InternalEHealthManagement.g:79:2: ( () otherlv_1= 'User' otherlv_2= '{' (otherlv_3= 'UserTypes' ( (lv_UserTypes_4_0= ruleAllowedUserTypes ) ) )? otherlv_5= '}' )
            // InternalEHealthManagement.g:80:3: () otherlv_1= 'User' otherlv_2= '{' (otherlv_3= 'UserTypes' ( (lv_UserTypes_4_0= ruleAllowedUserTypes ) ) )? otherlv_5= '}'
            {
            // InternalEHealthManagement.g:80:3: ()
            // InternalEHealthManagement.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUserAccess().getUserAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUserAccess().getUserKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEHealthManagement.g:95:3: (otherlv_3= 'UserTypes' ( (lv_UserTypes_4_0= ruleAllowedUserTypes ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEHealthManagement.g:96:4: otherlv_3= 'UserTypes' ( (lv_UserTypes_4_0= ruleAllowedUserTypes ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getUserAccess().getUserTypesKeyword_3_0());
                    			
                    // InternalEHealthManagement.g:100:4: ( (lv_UserTypes_4_0= ruleAllowedUserTypes ) )
                    // InternalEHealthManagement.g:101:5: (lv_UserTypes_4_0= ruleAllowedUserTypes )
                    {
                    // InternalEHealthManagement.g:101:5: (lv_UserTypes_4_0= ruleAllowedUserTypes )
                    // InternalEHealthManagement.g:102:6: lv_UserTypes_4_0= ruleAllowedUserTypes
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getUserTypesAllowedUserTypesEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_UserTypes_4_0=ruleAllowedUserTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						set(
                    							current,
                    							"UserTypes",
                    							lv_UserTypes_4_0,
                    							"org.example.ehealthmanagement.xtext.EHealthManagement.AllowedUserTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "ruleAllowedUserTypes"
    // InternalEHealthManagement.g:128:1: ruleAllowedUserTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'Doctor' ) | (enumLiteral_1= 'Patient' ) | (enumLiteral_2= 'SystemAdmin' ) ) ;
    public final Enumerator ruleAllowedUserTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEHealthManagement.g:134:2: ( ( (enumLiteral_0= 'Doctor' ) | (enumLiteral_1= 'Patient' ) | (enumLiteral_2= 'SystemAdmin' ) ) )
            // InternalEHealthManagement.g:135:2: ( (enumLiteral_0= 'Doctor' ) | (enumLiteral_1= 'Patient' ) | (enumLiteral_2= 'SystemAdmin' ) )
            {
            // InternalEHealthManagement.g:135:2: ( (enumLiteral_0= 'Doctor' ) | (enumLiteral_1= 'Patient' ) | (enumLiteral_2= 'SystemAdmin' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEHealthManagement.g:136:3: (enumLiteral_0= 'Doctor' )
                    {
                    // InternalEHealthManagement.g:136:3: (enumLiteral_0= 'Doctor' )
                    // InternalEHealthManagement.g:137:4: enumLiteral_0= 'Doctor'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getAllowedUserTypesAccess().getDoctorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAllowedUserTypesAccess().getDoctorEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEHealthManagement.g:144:3: (enumLiteral_1= 'Patient' )
                    {
                    // InternalEHealthManagement.g:144:3: (enumLiteral_1= 'Patient' )
                    // InternalEHealthManagement.g:145:4: enumLiteral_1= 'Patient'
                    {
                    enumLiteral_1=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getAllowedUserTypesAccess().getPatientEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAllowedUserTypesAccess().getPatientEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEHealthManagement.g:152:3: (enumLiteral_2= 'SystemAdmin' )
                    {
                    // InternalEHealthManagement.g:152:3: (enumLiteral_2= 'SystemAdmin' )
                    // InternalEHealthManagement.g:153:4: enumLiteral_2= 'SystemAdmin'
                    {
                    enumLiteral_2=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getAllowedUserTypesAccess().getSystemAdminEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAllowedUserTypesAccess().getSystemAdminEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAllowedUserTypes"


    // $ANTLR start "ruleAllowedUserInterfaces"
    // InternalEHealthManagement.g:163:1: ruleAllowedUserInterfaces returns [Enumerator current=null] : ( (enumLiteral_0= 'ProfileView' ) | (enumLiteral_1= 'InformationView' ) ) ;
    public final Enumerator ruleAllowedUserInterfaces() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEHealthManagement.g:169:2: ( ( (enumLiteral_0= 'ProfileView' ) | (enumLiteral_1= 'InformationView' ) ) )
            // InternalEHealthManagement.g:170:2: ( (enumLiteral_0= 'ProfileView' ) | (enumLiteral_1= 'InformationView' ) )
            {
            // InternalEHealthManagement.g:170:2: ( (enumLiteral_0= 'ProfileView' ) | (enumLiteral_1= 'InformationView' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEHealthManagement.g:171:3: (enumLiteral_0= 'ProfileView' )
                    {
                    // InternalEHealthManagement.g:171:3: (enumLiteral_0= 'ProfileView' )
                    // InternalEHealthManagement.g:172:4: enumLiteral_0= 'ProfileView'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getAllowedUserInterfacesAccess().getProfileViewEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAllowedUserInterfacesAccess().getProfileViewEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEHealthManagement.g:179:3: (enumLiteral_1= 'InformationView' )
                    {
                    // InternalEHealthManagement.g:179:3: (enumLiteral_1= 'InformationView' )
                    // InternalEHealthManagement.g:180:4: enumLiteral_1= 'InformationView'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getAllowedUserInterfacesAccess().getInformationViewEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAllowedUserInterfacesAccess().getInformationViewEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAllowedUserInterfaces"


    // $ANTLR start "ruleAllowedRepresentationInterfaceTypes"
    // InternalEHealthManagement.g:190:1: ruleAllowedRepresentationInterfaceTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'DoctorProfile' ) | (enumLiteral_1= 'PatientProfile' ) | (enumLiteral_2= 'MedicineList' ) | (enumLiteral_3= 'PrescriptionView' ) | (enumLiteral_4= 'DiagnosysView' ) ) ;
    public final Enumerator ruleAllowedRepresentationInterfaceTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEHealthManagement.g:196:2: ( ( (enumLiteral_0= 'DoctorProfile' ) | (enumLiteral_1= 'PatientProfile' ) | (enumLiteral_2= 'MedicineList' ) | (enumLiteral_3= 'PrescriptionView' ) | (enumLiteral_4= 'DiagnosysView' ) ) )
            // InternalEHealthManagement.g:197:2: ( (enumLiteral_0= 'DoctorProfile' ) | (enumLiteral_1= 'PatientProfile' ) | (enumLiteral_2= 'MedicineList' ) | (enumLiteral_3= 'PrescriptionView' ) | (enumLiteral_4= 'DiagnosysView' ) )
            {
            // InternalEHealthManagement.g:197:2: ( (enumLiteral_0= 'DoctorProfile' ) | (enumLiteral_1= 'PatientProfile' ) | (enumLiteral_2= 'MedicineList' ) | (enumLiteral_3= 'PrescriptionView' ) | (enumLiteral_4= 'DiagnosysView' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalEHealthManagement.g:198:3: (enumLiteral_0= 'DoctorProfile' )
                    {
                    // InternalEHealthManagement.g:198:3: (enumLiteral_0= 'DoctorProfile' )
                    // InternalEHealthManagement.g:199:4: enumLiteral_0= 'DoctorProfile'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getDoctorProfileEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getDoctorProfileEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEHealthManagement.g:206:3: (enumLiteral_1= 'PatientProfile' )
                    {
                    // InternalEHealthManagement.g:206:3: (enumLiteral_1= 'PatientProfile' )
                    // InternalEHealthManagement.g:207:4: enumLiteral_1= 'PatientProfile'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getPatientProfileEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getPatientProfileEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEHealthManagement.g:214:3: (enumLiteral_2= 'MedicineList' )
                    {
                    // InternalEHealthManagement.g:214:3: (enumLiteral_2= 'MedicineList' )
                    // InternalEHealthManagement.g:215:4: enumLiteral_2= 'MedicineList'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getMedicineListEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getMedicineListEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEHealthManagement.g:222:3: (enumLiteral_3= 'PrescriptionView' )
                    {
                    // InternalEHealthManagement.g:222:3: (enumLiteral_3= 'PrescriptionView' )
                    // InternalEHealthManagement.g:223:4: enumLiteral_3= 'PrescriptionView'
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getPrescriptionViewEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getPrescriptionViewEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEHealthManagement.g:230:3: (enumLiteral_4= 'DiagnosysView' )
                    {
                    // InternalEHealthManagement.g:230:3: (enumLiteral_4= 'DiagnosysView' )
                    // InternalEHealthManagement.g:231:4: enumLiteral_4= 'DiagnosysView'
                    {
                    enumLiteral_4=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getDiagnosysViewEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getDiagnosysViewEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleAllowedRepresentationInterfaceTypes"


    // $ANTLR start "ruleAllowedCommunicationInterfaceTypes"
    // InternalEHealthManagement.g:241:1: ruleAllowedCommunicationInterfaceTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'CommunicationView' ) | (enumLiteral_1= 'NotificationView' ) | (enumLiteral_2= 'FeedbackView' ) ) ;
    public final Enumerator ruleAllowedCommunicationInterfaceTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEHealthManagement.g:247:2: ( ( (enumLiteral_0= 'CommunicationView' ) | (enumLiteral_1= 'NotificationView' ) | (enumLiteral_2= 'FeedbackView' ) ) )
            // InternalEHealthManagement.g:248:2: ( (enumLiteral_0= 'CommunicationView' ) | (enumLiteral_1= 'NotificationView' ) | (enumLiteral_2= 'FeedbackView' ) )
            {
            // InternalEHealthManagement.g:248:2: ( (enumLiteral_0= 'CommunicationView' ) | (enumLiteral_1= 'NotificationView' ) | (enumLiteral_2= 'FeedbackView' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEHealthManagement.g:249:3: (enumLiteral_0= 'CommunicationView' )
                    {
                    // InternalEHealthManagement.g:249:3: (enumLiteral_0= 'CommunicationView' )
                    // InternalEHealthManagement.g:250:4: enumLiteral_0= 'CommunicationView'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getCommunicationViewEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getCommunicationViewEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEHealthManagement.g:257:3: (enumLiteral_1= 'NotificationView' )
                    {
                    // InternalEHealthManagement.g:257:3: (enumLiteral_1= 'NotificationView' )
                    // InternalEHealthManagement.g:258:4: enumLiteral_1= 'NotificationView'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getNotificationViewEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getNotificationViewEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEHealthManagement.g:265:3: (enumLiteral_2= 'FeedbackView' )
                    {
                    // InternalEHealthManagement.g:265:3: (enumLiteral_2= 'FeedbackView' )
                    // InternalEHealthManagement.g:266:4: enumLiteral_2= 'FeedbackView'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getFeedbackViewEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getFeedbackViewEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAllowedCommunicationInterfaceTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}