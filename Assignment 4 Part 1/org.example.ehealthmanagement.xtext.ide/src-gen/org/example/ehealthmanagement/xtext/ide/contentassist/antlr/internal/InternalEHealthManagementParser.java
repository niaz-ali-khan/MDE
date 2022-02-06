package org.example.ehealthmanagement.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.ehealthmanagement.xtext.services.EHealthManagementGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEHealthManagementParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Doctor'", "'Patient'", "'SystemAdmin'", "'ProfileView'", "'InformationView'", "'DoctorProfile'", "'PatientProfile'", "'MedicineList'", "'PrescriptionView'", "'DiagnosysView'", "'CommunicationView'", "'NotificationView'", "'FeedbackView'", "'User'", "'{'", "'}'", "'UserTypes'"
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

    	public void setGrammarAccess(EHealthManagementGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleUser"
    // InternalEHealthManagement.g:53:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalEHealthManagement.g:54:1: ( ruleUser EOF )
            // InternalEHealthManagement.g:55:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalEHealthManagement.g:62:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:66:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalEHealthManagement.g:67:2: ( ( rule__User__Group__0 ) )
            {
            // InternalEHealthManagement.g:67:2: ( ( rule__User__Group__0 ) )
            // InternalEHealthManagement.g:68:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalEHealthManagement.g:69:3: ( rule__User__Group__0 )
            // InternalEHealthManagement.g:69:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "ruleAllowedUserTypes"
    // InternalEHealthManagement.g:78:1: ruleAllowedUserTypes : ( ( rule__AllowedUserTypes__Alternatives ) ) ;
    public final void ruleAllowedUserTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:82:1: ( ( ( rule__AllowedUserTypes__Alternatives ) ) )
            // InternalEHealthManagement.g:83:2: ( ( rule__AllowedUserTypes__Alternatives ) )
            {
            // InternalEHealthManagement.g:83:2: ( ( rule__AllowedUserTypes__Alternatives ) )
            // InternalEHealthManagement.g:84:3: ( rule__AllowedUserTypes__Alternatives )
            {
             before(grammarAccess.getAllowedUserTypesAccess().getAlternatives()); 
            // InternalEHealthManagement.g:85:3: ( rule__AllowedUserTypes__Alternatives )
            // InternalEHealthManagement.g:85:4: rule__AllowedUserTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AllowedUserTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAllowedUserTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAllowedUserTypes"


    // $ANTLR start "ruleAllowedUserInterfaces"
    // InternalEHealthManagement.g:94:1: ruleAllowedUserInterfaces : ( ( rule__AllowedUserInterfaces__Alternatives ) ) ;
    public final void ruleAllowedUserInterfaces() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:98:1: ( ( ( rule__AllowedUserInterfaces__Alternatives ) ) )
            // InternalEHealthManagement.g:99:2: ( ( rule__AllowedUserInterfaces__Alternatives ) )
            {
            // InternalEHealthManagement.g:99:2: ( ( rule__AllowedUserInterfaces__Alternatives ) )
            // InternalEHealthManagement.g:100:3: ( rule__AllowedUserInterfaces__Alternatives )
            {
             before(grammarAccess.getAllowedUserInterfacesAccess().getAlternatives()); 
            // InternalEHealthManagement.g:101:3: ( rule__AllowedUserInterfaces__Alternatives )
            // InternalEHealthManagement.g:101:4: rule__AllowedUserInterfaces__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AllowedUserInterfaces__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAllowedUserInterfacesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAllowedUserInterfaces"


    // $ANTLR start "ruleAllowedRepresentationInterfaceTypes"
    // InternalEHealthManagement.g:110:1: ruleAllowedRepresentationInterfaceTypes : ( ( rule__AllowedRepresentationInterfaceTypes__Alternatives ) ) ;
    public final void ruleAllowedRepresentationInterfaceTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:114:1: ( ( ( rule__AllowedRepresentationInterfaceTypes__Alternatives ) ) )
            // InternalEHealthManagement.g:115:2: ( ( rule__AllowedRepresentationInterfaceTypes__Alternatives ) )
            {
            // InternalEHealthManagement.g:115:2: ( ( rule__AllowedRepresentationInterfaceTypes__Alternatives ) )
            // InternalEHealthManagement.g:116:3: ( rule__AllowedRepresentationInterfaceTypes__Alternatives )
            {
             before(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getAlternatives()); 
            // InternalEHealthManagement.g:117:3: ( rule__AllowedRepresentationInterfaceTypes__Alternatives )
            // InternalEHealthManagement.g:117:4: rule__AllowedRepresentationInterfaceTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AllowedRepresentationInterfaceTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAllowedRepresentationInterfaceTypes"


    // $ANTLR start "ruleAllowedCommunicationInterfaceTypes"
    // InternalEHealthManagement.g:126:1: ruleAllowedCommunicationInterfaceTypes : ( ( rule__AllowedCommunicationInterfaceTypes__Alternatives ) ) ;
    public final void ruleAllowedCommunicationInterfaceTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:130:1: ( ( ( rule__AllowedCommunicationInterfaceTypes__Alternatives ) ) )
            // InternalEHealthManagement.g:131:2: ( ( rule__AllowedCommunicationInterfaceTypes__Alternatives ) )
            {
            // InternalEHealthManagement.g:131:2: ( ( rule__AllowedCommunicationInterfaceTypes__Alternatives ) )
            // InternalEHealthManagement.g:132:3: ( rule__AllowedCommunicationInterfaceTypes__Alternatives )
            {
             before(grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getAlternatives()); 
            // InternalEHealthManagement.g:133:3: ( rule__AllowedCommunicationInterfaceTypes__Alternatives )
            // InternalEHealthManagement.g:133:4: rule__AllowedCommunicationInterfaceTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AllowedCommunicationInterfaceTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAllowedCommunicationInterfaceTypes"


    // $ANTLR start "rule__AllowedUserTypes__Alternatives"
    // InternalEHealthManagement.g:141:1: rule__AllowedUserTypes__Alternatives : ( ( ( 'Doctor' ) ) | ( ( 'Patient' ) ) | ( ( 'SystemAdmin' ) ) );
    public final void rule__AllowedUserTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:145:1: ( ( ( 'Doctor' ) ) | ( ( 'Patient' ) ) | ( ( 'SystemAdmin' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalEHealthManagement.g:146:2: ( ( 'Doctor' ) )
                    {
                    // InternalEHealthManagement.g:146:2: ( ( 'Doctor' ) )
                    // InternalEHealthManagement.g:147:3: ( 'Doctor' )
                    {
                     before(grammarAccess.getAllowedUserTypesAccess().getDoctorEnumLiteralDeclaration_0()); 
                    // InternalEHealthManagement.g:148:3: ( 'Doctor' )
                    // InternalEHealthManagement.g:148:4: 'Doctor'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedUserTypesAccess().getDoctorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEHealthManagement.g:152:2: ( ( 'Patient' ) )
                    {
                    // InternalEHealthManagement.g:152:2: ( ( 'Patient' ) )
                    // InternalEHealthManagement.g:153:3: ( 'Patient' )
                    {
                     before(grammarAccess.getAllowedUserTypesAccess().getPatientEnumLiteralDeclaration_1()); 
                    // InternalEHealthManagement.g:154:3: ( 'Patient' )
                    // InternalEHealthManagement.g:154:4: 'Patient'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedUserTypesAccess().getPatientEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEHealthManagement.g:158:2: ( ( 'SystemAdmin' ) )
                    {
                    // InternalEHealthManagement.g:158:2: ( ( 'SystemAdmin' ) )
                    // InternalEHealthManagement.g:159:3: ( 'SystemAdmin' )
                    {
                     before(grammarAccess.getAllowedUserTypesAccess().getSystemAdminEnumLiteralDeclaration_2()); 
                    // InternalEHealthManagement.g:160:3: ( 'SystemAdmin' )
                    // InternalEHealthManagement.g:160:4: 'SystemAdmin'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedUserTypesAccess().getSystemAdminEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__AllowedUserTypes__Alternatives"


    // $ANTLR start "rule__AllowedUserInterfaces__Alternatives"
    // InternalEHealthManagement.g:168:1: rule__AllowedUserInterfaces__Alternatives : ( ( ( 'ProfileView' ) ) | ( ( 'InformationView' ) ) );
    public final void rule__AllowedUserInterfaces__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:172:1: ( ( ( 'ProfileView' ) ) | ( ( 'InformationView' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEHealthManagement.g:173:2: ( ( 'ProfileView' ) )
                    {
                    // InternalEHealthManagement.g:173:2: ( ( 'ProfileView' ) )
                    // InternalEHealthManagement.g:174:3: ( 'ProfileView' )
                    {
                     before(grammarAccess.getAllowedUserInterfacesAccess().getProfileViewEnumLiteralDeclaration_0()); 
                    // InternalEHealthManagement.g:175:3: ( 'ProfileView' )
                    // InternalEHealthManagement.g:175:4: 'ProfileView'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedUserInterfacesAccess().getProfileViewEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEHealthManagement.g:179:2: ( ( 'InformationView' ) )
                    {
                    // InternalEHealthManagement.g:179:2: ( ( 'InformationView' ) )
                    // InternalEHealthManagement.g:180:3: ( 'InformationView' )
                    {
                     before(grammarAccess.getAllowedUserInterfacesAccess().getInformationViewEnumLiteralDeclaration_1()); 
                    // InternalEHealthManagement.g:181:3: ( 'InformationView' )
                    // InternalEHealthManagement.g:181:4: 'InformationView'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedUserInterfacesAccess().getInformationViewEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AllowedUserInterfaces__Alternatives"


    // $ANTLR start "rule__AllowedRepresentationInterfaceTypes__Alternatives"
    // InternalEHealthManagement.g:189:1: rule__AllowedRepresentationInterfaceTypes__Alternatives : ( ( ( 'DoctorProfile' ) ) | ( ( 'PatientProfile' ) ) | ( ( 'MedicineList' ) ) | ( ( 'PrescriptionView' ) ) | ( ( 'DiagnosysView' ) ) );
    public final void rule__AllowedRepresentationInterfaceTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:193:1: ( ( ( 'DoctorProfile' ) ) | ( ( 'PatientProfile' ) ) | ( ( 'MedicineList' ) ) | ( ( 'PrescriptionView' ) ) | ( ( 'DiagnosysView' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEHealthManagement.g:194:2: ( ( 'DoctorProfile' ) )
                    {
                    // InternalEHealthManagement.g:194:2: ( ( 'DoctorProfile' ) )
                    // InternalEHealthManagement.g:195:3: ( 'DoctorProfile' )
                    {
                     before(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getDoctorProfileEnumLiteralDeclaration_0()); 
                    // InternalEHealthManagement.g:196:3: ( 'DoctorProfile' )
                    // InternalEHealthManagement.g:196:4: 'DoctorProfile'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getDoctorProfileEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEHealthManagement.g:200:2: ( ( 'PatientProfile' ) )
                    {
                    // InternalEHealthManagement.g:200:2: ( ( 'PatientProfile' ) )
                    // InternalEHealthManagement.g:201:3: ( 'PatientProfile' )
                    {
                     before(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getPatientProfileEnumLiteralDeclaration_1()); 
                    // InternalEHealthManagement.g:202:3: ( 'PatientProfile' )
                    // InternalEHealthManagement.g:202:4: 'PatientProfile'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getPatientProfileEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEHealthManagement.g:206:2: ( ( 'MedicineList' ) )
                    {
                    // InternalEHealthManagement.g:206:2: ( ( 'MedicineList' ) )
                    // InternalEHealthManagement.g:207:3: ( 'MedicineList' )
                    {
                     before(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getMedicineListEnumLiteralDeclaration_2()); 
                    // InternalEHealthManagement.g:208:3: ( 'MedicineList' )
                    // InternalEHealthManagement.g:208:4: 'MedicineList'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getMedicineListEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEHealthManagement.g:212:2: ( ( 'PrescriptionView' ) )
                    {
                    // InternalEHealthManagement.g:212:2: ( ( 'PrescriptionView' ) )
                    // InternalEHealthManagement.g:213:3: ( 'PrescriptionView' )
                    {
                     before(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getPrescriptionViewEnumLiteralDeclaration_3()); 
                    // InternalEHealthManagement.g:214:3: ( 'PrescriptionView' )
                    // InternalEHealthManagement.g:214:4: 'PrescriptionView'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getPrescriptionViewEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEHealthManagement.g:218:2: ( ( 'DiagnosysView' ) )
                    {
                    // InternalEHealthManagement.g:218:2: ( ( 'DiagnosysView' ) )
                    // InternalEHealthManagement.g:219:3: ( 'DiagnosysView' )
                    {
                     before(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getDiagnosysViewEnumLiteralDeclaration_4()); 
                    // InternalEHealthManagement.g:220:3: ( 'DiagnosysView' )
                    // InternalEHealthManagement.g:220:4: 'DiagnosysView'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedRepresentationInterfaceTypesAccess().getDiagnosysViewEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__AllowedRepresentationInterfaceTypes__Alternatives"


    // $ANTLR start "rule__AllowedCommunicationInterfaceTypes__Alternatives"
    // InternalEHealthManagement.g:228:1: rule__AllowedCommunicationInterfaceTypes__Alternatives : ( ( ( 'CommunicationView' ) ) | ( ( 'NotificationView' ) ) | ( ( 'FeedbackView' ) ) );
    public final void rule__AllowedCommunicationInterfaceTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:232:1: ( ( ( 'CommunicationView' ) ) | ( ( 'NotificationView' ) ) | ( ( 'FeedbackView' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalEHealthManagement.g:233:2: ( ( 'CommunicationView' ) )
                    {
                    // InternalEHealthManagement.g:233:2: ( ( 'CommunicationView' ) )
                    // InternalEHealthManagement.g:234:3: ( 'CommunicationView' )
                    {
                     before(grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getCommunicationViewEnumLiteralDeclaration_0()); 
                    // InternalEHealthManagement.g:235:3: ( 'CommunicationView' )
                    // InternalEHealthManagement.g:235:4: 'CommunicationView'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getCommunicationViewEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEHealthManagement.g:239:2: ( ( 'NotificationView' ) )
                    {
                    // InternalEHealthManagement.g:239:2: ( ( 'NotificationView' ) )
                    // InternalEHealthManagement.g:240:3: ( 'NotificationView' )
                    {
                     before(grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getNotificationViewEnumLiteralDeclaration_1()); 
                    // InternalEHealthManagement.g:241:3: ( 'NotificationView' )
                    // InternalEHealthManagement.g:241:4: 'NotificationView'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getNotificationViewEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEHealthManagement.g:245:2: ( ( 'FeedbackView' ) )
                    {
                    // InternalEHealthManagement.g:245:2: ( ( 'FeedbackView' ) )
                    // InternalEHealthManagement.g:246:3: ( 'FeedbackView' )
                    {
                     before(grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getFeedbackViewEnumLiteralDeclaration_2()); 
                    // InternalEHealthManagement.g:247:3: ( 'FeedbackView' )
                    // InternalEHealthManagement.g:247:4: 'FeedbackView'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getAllowedCommunicationInterfaceTypesAccess().getFeedbackViewEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__AllowedCommunicationInterfaceTypes__Alternatives"


    // $ANTLR start "rule__User__Group__0"
    // InternalEHealthManagement.g:255:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:259:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalEHealthManagement.g:260:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__1();

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
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // InternalEHealthManagement.g:267:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:271:1: ( ( () ) )
            // InternalEHealthManagement.g:272:1: ( () )
            {
            // InternalEHealthManagement.g:272:1: ( () )
            // InternalEHealthManagement.g:273:2: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // InternalEHealthManagement.g:274:2: ()
            // InternalEHealthManagement.g:274:3: 
            {
            }

             after(grammarAccess.getUserAccess().getUserAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalEHealthManagement.g:282:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:286:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalEHealthManagement.g:287:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__2();

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
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // InternalEHealthManagement.g:294:1: rule__User__Group__1__Impl : ( 'User' ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:298:1: ( ( 'User' ) )
            // InternalEHealthManagement.g:299:1: ( 'User' )
            {
            // InternalEHealthManagement.g:299:1: ( 'User' )
            // InternalEHealthManagement.g:300:2: 'User'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUserKeyword_1()); 

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
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__User__Group__2"
    // InternalEHealthManagement.g:309:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:313:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // InternalEHealthManagement.g:314:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__3();

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
    // $ANTLR end "rule__User__Group__2"


    // $ANTLR start "rule__User__Group__2__Impl"
    // InternalEHealthManagement.g:321:1: rule__User__Group__2__Impl : ( '{' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:325:1: ( ( '{' ) )
            // InternalEHealthManagement.g:326:1: ( '{' )
            {
            // InternalEHealthManagement.g:326:1: ( '{' )
            // InternalEHealthManagement.g:327:2: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__User__Group__2__Impl"


    // $ANTLR start "rule__User__Group__3"
    // InternalEHealthManagement.g:336:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:340:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // InternalEHealthManagement.g:341:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__4();

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
    // $ANTLR end "rule__User__Group__3"


    // $ANTLR start "rule__User__Group__3__Impl"
    // InternalEHealthManagement.g:348:1: rule__User__Group__3__Impl : ( ( rule__User__Group_3__0 )? ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:352:1: ( ( ( rule__User__Group_3__0 )? ) )
            // InternalEHealthManagement.g:353:1: ( ( rule__User__Group_3__0 )? )
            {
            // InternalEHealthManagement.g:353:1: ( ( rule__User__Group_3__0 )? )
            // InternalEHealthManagement.g:354:2: ( rule__User__Group_3__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_3()); 
            // InternalEHealthManagement.g:355:2: ( rule__User__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEHealthManagement.g:355:3: rule__User__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__User__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_3()); 

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
    // $ANTLR end "rule__User__Group__3__Impl"


    // $ANTLR start "rule__User__Group__4"
    // InternalEHealthManagement.g:363:1: rule__User__Group__4 : rule__User__Group__4__Impl ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:367:1: ( rule__User__Group__4__Impl )
            // InternalEHealthManagement.g:368:2: rule__User__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__4__Impl();

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
    // $ANTLR end "rule__User__Group__4"


    // $ANTLR start "rule__User__Group__4__Impl"
    // InternalEHealthManagement.g:374:1: rule__User__Group__4__Impl : ( '}' ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:378:1: ( ( '}' ) )
            // InternalEHealthManagement.g:379:1: ( '}' )
            {
            // InternalEHealthManagement.g:379:1: ( '}' )
            // InternalEHealthManagement.g:380:2: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__User__Group__4__Impl"


    // $ANTLR start "rule__User__Group_3__0"
    // InternalEHealthManagement.g:390:1: rule__User__Group_3__0 : rule__User__Group_3__0__Impl rule__User__Group_3__1 ;
    public final void rule__User__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:394:1: ( rule__User__Group_3__0__Impl rule__User__Group_3__1 )
            // InternalEHealthManagement.g:395:2: rule__User__Group_3__0__Impl rule__User__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__User__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_3__1();

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
    // $ANTLR end "rule__User__Group_3__0"


    // $ANTLR start "rule__User__Group_3__0__Impl"
    // InternalEHealthManagement.g:402:1: rule__User__Group_3__0__Impl : ( 'UserTypes' ) ;
    public final void rule__User__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:406:1: ( ( 'UserTypes' ) )
            // InternalEHealthManagement.g:407:1: ( 'UserTypes' )
            {
            // InternalEHealthManagement.g:407:1: ( 'UserTypes' )
            // InternalEHealthManagement.g:408:2: 'UserTypes'
            {
             before(grammarAccess.getUserAccess().getUserTypesKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUserTypesKeyword_3_0()); 

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
    // $ANTLR end "rule__User__Group_3__0__Impl"


    // $ANTLR start "rule__User__Group_3__1"
    // InternalEHealthManagement.g:417:1: rule__User__Group_3__1 : rule__User__Group_3__1__Impl ;
    public final void rule__User__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:421:1: ( rule__User__Group_3__1__Impl )
            // InternalEHealthManagement.g:422:2: rule__User__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_3__1__Impl();

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
    // $ANTLR end "rule__User__Group_3__1"


    // $ANTLR start "rule__User__Group_3__1__Impl"
    // InternalEHealthManagement.g:428:1: rule__User__Group_3__1__Impl : ( ( rule__User__UserTypesAssignment_3_1 ) ) ;
    public final void rule__User__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:432:1: ( ( ( rule__User__UserTypesAssignment_3_1 ) ) )
            // InternalEHealthManagement.g:433:1: ( ( rule__User__UserTypesAssignment_3_1 ) )
            {
            // InternalEHealthManagement.g:433:1: ( ( rule__User__UserTypesAssignment_3_1 ) )
            // InternalEHealthManagement.g:434:2: ( rule__User__UserTypesAssignment_3_1 )
            {
             before(grammarAccess.getUserAccess().getUserTypesAssignment_3_1()); 
            // InternalEHealthManagement.g:435:2: ( rule__User__UserTypesAssignment_3_1 )
            // InternalEHealthManagement.g:435:3: rule__User__UserTypesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__User__UserTypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getUserTypesAssignment_3_1()); 

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
    // $ANTLR end "rule__User__Group_3__1__Impl"


    // $ANTLR start "rule__User__UserTypesAssignment_3_1"
    // InternalEHealthManagement.g:444:1: rule__User__UserTypesAssignment_3_1 : ( ruleAllowedUserTypes ) ;
    public final void rule__User__UserTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHealthManagement.g:448:1: ( ( ruleAllowedUserTypes ) )
            // InternalEHealthManagement.g:449:2: ( ruleAllowedUserTypes )
            {
            // InternalEHealthManagement.g:449:2: ( ruleAllowedUserTypes )
            // InternalEHealthManagement.g:450:3: ruleAllowedUserTypes
            {
             before(grammarAccess.getUserAccess().getUserTypesAllowedUserTypesEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAllowedUserTypes();

            state._fsp--;

             after(grammarAccess.getUserAccess().getUserTypesAllowedUserTypesEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__User__UserTypesAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003800L});

}