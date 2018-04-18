//Hutchings High School and Junior College.
//NAME:-Parth.H.Pancholi.
//CLASS:-Xll.
import java.util.*;
class ISC_COMPUTER_SCIENCE_PROJECT
{
    int cntr;
    char tc;
    String bv[]=new String[61];
    int br[]=new int[61];
    String lv[]=new String[66];
    int lr[]=new int[66];
    String bmv[]=new String[50];
    int bmr[]=new int[50];
    String wv[]=new String[50];
    int wr[]=new int[50];
    String muv[]=new String[50];
    int mur[]=new int[50];
    String pv[]=new String[50];
    int pr[]=new int[50];
    String cv[]=new String[61];
    int cr[]=new int[61];
    String rv[]=new String[62];
    int rr[]=new int[62];
    String mcv[]=new String[57];
    int mcr[]=new int[57];
    String av[]=new String[60];
    int ar[]=new int[60];
    String[][] allran={av,bv,bmv,cv,lv,mcv,muv,pv,rv,wv};
    String allranname[]=new String[]{"ARSENAL","BARCELONA","BAYERN MUNICH","CHELSEA","LIVERPOOL","MANCHESTER CITY","MANCHESTER UNITED","PARIS ST.GERMAN","REAL MADRID","WOLFSBURG"};
    int[][] allranr={ar,br,bmr,cr,lr,mcr,mur,pr,rr,wr};
    int acc=500;
    public void specificteam(char x)//GAME MODE SPECIFIC TEAM
    {
        Scanner sc=new Scanner(System.in);
        av[0]="BOREHAM WOODS";av[1]="NEW YORK RED BULLS";av[2]="BENFICA";av[3]="MONACO";av[4]="MANCHESTER CITY";av[5]="CRYSTAL PALACEC";av[6]="BESLKTAS";
        av[7]="EVERTON";av[8]="BESLKTAS";av[9]="LEICESTER CITY";av[10]="MANCHESTER CITY";av[11]="BORUSSIA DORTMUND";av[12]="ASTON VILLA";av[13]="SOUTHAMPTON";
        av[14]="TOTTENHAM HOTSPUR";av[15]="GALATASARAY";av[16]="CHELSEA";av[17]="HULL CITY";av[18]="ANDERLECHT";av[19]="SUDERLAND";av[20]="BURNLEY";
        av[21]="ANDERLECHT";av[22]="SWANSEA CITY";av[23]="MANCHESTER UNITED";av[24]="BORUSSIA DORTMUND";av[25]="WEST BROMWICH ALBION";av[26]="SOUTHAMPTON";
        av[27]="STOKE CITY";av[28]="GALATASARAY";av[29]="NEWCASTLE UNITED";av[30]="LIVERPOOL";av[31]="QUEENS PARK RANGERS";av[32]="WEST HAM UNITED";
        av[33]="SOUTHAMPTON";av[34]="HULL CITY";av[35]="STOKE CITY";av[36]="MANCHESTER CITY";av[37]="BRIGHTON AND HOVE ALBION";av[38]="ASTON VILLA";
        av[39]="TOTTENHAM HOTSPUR";av[40]="LEICESTER CITY";av[41]="MIDDLESBROUGH";av[42]="CRYSTAL PALACE";av[43]="MONACO";av[44]="EVERTON";
        av[45]="QUEENS PARK RANGERS";av[46]="MANCHESTER UNITED";av[47]="WEST HAM UNITED";av[48]="MONACO";av[49]="NEWCASTLE UNITED";av[50]="LIVERPOOL";
        av[51]="BURNLEY";av[52]="READING";av[53]="CHELSEA";av[54]="HULL CITY";av[55]="SWANSEA CITY";av[56]="MANCHESTER UNITED";av[57]="SUNDERLAND";
        av[58]="WEST BROMWICH ALBION"; av[59]="ASTON VILLA";
        ar[0]=1;ar[1]=-1;ar[2]=1;ar[3]=-1;ar[4]=1;ar[5]=1;ar[6]=0;ar[7]=0;ar[8]=1;ar[9]=0;ar[10]=0;ar[11]=-1;ar[12]=1;ar[13]=-1;ar[14]=0;ar[15]=1;ar[16]=-1;
        ar[17]=0;ar[18]=1;ar[19]=1;ar[20]=1;ar[21]=0;ar[22]=-1;ar[23]=-1;ar[24]=1;ar[25]=1;ar[26]=1;ar[27]=-1;ar[28]=1;ar[29]=1;ar[30]=0;ar[31]=1;ar[32]=1;
        ar[33]=-1;ar[34]=1;ar[35]=1;ar[36]=1;ar[37]=1;ar[38]=1;ar[39]=-1;ar[40]=1;ar[41]=1;ar[42]=1;ar[43]=-1;ar[44]=1;ar[45]=1;ar[46]=1;ar[47]=1;ar[48]=1;
        ar[49]=1;ar[50]=1;ar[51]=1;ar[52]=1;ar[53]=0;ar[54]=1;ar[55]=-1;ar[56]=0;ar[57]=0;ar[58]=1;ar[59]=1;
        
        
        
        
        bv[0]="ELCE";bv[1]="VILLAREAL";bv[2]="ATHELETIC BILAO";bv[3]="APOEL NICOSLA";bv[4]="LEVANTE";bv[5]="MALAGA";bv[6]="GRANADA";bv[7]="PARIS ST.GERMAN";
        bv[8]="RAYA VALLECANA";bv[9]="EIBAR";bv[10]="AJAX";bv[11]="REAL MADRID";bv[12]="CELTA VIGO";bv[13]="AJAX";bv[14]="ALMERIA";bv[15]="SEVELLA";
        bv[16]="APOEL NICOSLA";bv[17]="VALENCIA";bv[18]="SD HUESCA";bv[19]="ESPANYAL";bv[20]="PARIS ST.GERMAN";bv[21]="GETAFE";bv[22]="SD HUESCA";bv[23]="CORDOBA";
        bv[24]="REAL SOCIEDAD";bv[25]="ELCA";bv[26]="ATHELETECO MADRID";bv[27]="ELCE";bv[28]="DEPORTIVO";bv[29]="ATHELETICO MADRID";bv[30]="ELCE";
        bv[31]="ATHELETICO MADRID";bv[32]="VILLAREAL";bv[33]="ATHELETIC BILBAO";bv[34]="VILLLAREAL";bv[35]="LEVANTE";bv[36]="MALAGA";bv[37]="MACHESTER CITY";
        bv[38]="GRANADA";bv[39]="VILLAREAL";bv[40]="RAYA VALLECANO";bv[41]="EIBAR";bv[42]="MANCHESTER CITY";bv[43]="REAL MADRID";bv[44]="CELTA VIGO";
        bv[45]="ALMERIA";bv[46]="SEVIALLA";bv[47]="PARIS ST.GERMAN";bv[48]="VALENCIA";bv[49]="PARIS ST.GERMAN";bv[50]="ESPANYOL";bv[51]="GETAFE";bv[52]="CORDOBA";
        bv[53]="BAYERN MUNICH";bv[54]="REAL SOCIEDAD";bv[55]="BAYERN MUNICH";bv[56]="ATHELETICO MADRID";bv[57]="DEPORTIVO";bv[58]="ATHELETICO BILBAO";bv[59]="JUVENTUS";
        br[0]=1;br[1]=1;br[2]=1;br[3]=1;br[4]=1;br[5]=0;br[6]=1;br[7]=-1;br[8]=1;br[9]=1;br[10]=1;br[11]=-1;br[12]=-1;br[13]=1;br[14]=1;br[15]=1;br[16]=1;
        br[17]=1;br[18]=1;br[19]=1;br[20]=1;br[21]=0;br[22]=1;br[23]=1;br[24]=-1;br[25]=1;br[26]=1;br[27]=1;br[28]=1;br[29]=1;br[30]=1;br[31]=1;br[32]=1;
        br[33]=1;br[34]=1;br[35]=1;br[36]=-1;br[37]=1;br[38]=1;br[39]=1;br[40]=1;br[41]=1;br[42]=1;br[43]=1;br[44]=1;br[45]=1;br[46]=0;br[47]=1;br[48]=1;
        br[49]=1;br[50]=1;br[51]=1;br[52]=1;br[53]=1;br[54]=1;br[55]=-1;br[56]=1;br[57]=0;br[58]=1;br[59]=1;
        
        
        
        
        bmv[0]="GUDLAJARA";bmv[1]="WOLFBURG";bmv[2]="SCHALKE";bmv[3]="STUTGART";bmv[4]="MANCHESTER CITY";bmv[5]="HAMBURG";bmv[6]="SC PADERBORN 07";bmv[7]="COLOGNE";
        bmv[8]="CSKA MOSCOW";bmv[9]="HANNOVER 96";bmv[10]="WERDER BREMEN";bmv[11]="ROMA";bmv[12]="BORUSSIA MONHENGLADBACH";bmv[13]="BORUSSIA DORTMUND";bmv[14]="ROMA";
        bmv[15]="ELNTRACKT FRANKFURT";bmv[16]="HOFFENHELM";bmv[17]="MANCHESTER CITY";bmv[18]="HERTHA BERLIN";bmv[19]="BAYER LEVERKUSEN";bmv[20]="CSKA MOSCOW";
        bmv[21]="FC AUGSBURG";bmv[22]="SC FRELBERG";bmv[23]="MAINZ";bmv[24]="WOLFBURG";bmv[25]="SCHALKE";bmv[26]="STUTTGART";bmv[27]="HAMBUG";bmv[28]="SHKHTAR DONETSK";
        bmv[29]="SC PADERBORN 07";bmv[30]="COLGNE";bmv[31]="ELNRACHT BRAUNSCHWEIG";bmv[32]="HANNOVER 96";bmv[33]="SHAKTAR DONETSK";bmv[34]="WERDER BREMEN ";
        bmv[35]="BORUSSIA MONCHENGLADBACH";bmv[36]="BORUSSIA DORTMUND";bmv[37]="BAYER LEVERKUSEN";bmv[38]="ELNTRACHT FRANKFURT";bmv[39]="FC PORTO";bmv[40]="HOFFENHELM";
        bmv[41]="FC PORTO";bmv[42]="HERTHA BERLI";bmv[43]="BORUSSIA DORTMUND";bmv[44]="BAYER LEVERKUSEN";bmv[45]="BARCELONA";bmv[46]="FC AYGSBURG";bmv[47]="BARCELONA";
        bmv[48]="SC FRELBURG";bmv[49]="MAINZ";
        bmr[0]=1;bmr[1]=1;bmr[2]=0;bmr[3]=1;bmr[4]=1;bmr[5]=0;bmr[6]=1;bmr[7]=1;bmr[8]=1;bmr[9]=1;bmr[10]=1;bmr[11]=0;bmr[12]=1;bmr[13]=1;bmr[14]=1;bmr[15]=1;
        bmr[16]=-1;bmr[17]=1;bmr[18]=1;bmr[19]=1;bmr[20]=1;bmr[21]=1;bmr[22]=1;bmr[23]=-1;bmr[24]=0;bmr[25]=1;bmr[26]=1;bmr[27]=0;bmr[28]=1;bmr[29]=1;bmr[30]=1;
        bmr[31]=1;bmr[32]=1;bmr[33]=1;bmr[34]=-1;bmr[35]=1;bmr[36]=0;bmr[37]=1;bmr[38]=-1;bmr[39]=1;bmr[40]=1;bmr[41]=1;bmr[42]=1;bmr[43]=0;bmr[44]=-1;bmr[45]=-1;
        bmr[46]=-1;bmr[47]=1;bmr[48]=-1;bmr[49]=1;
        
        
        
        
        cv[0]="WYCOMBE WANDERERS";cv[1]="RZ PELLETS WAC";cv[2]="WITESSE AMHEM";cv[3]="WERDER BREMEN";cv[4]="REAL SOCIEDAD";cv[5]="BURNLEY";cv[6]="LEICESTER CITY";
        cv[7]="EVERTON";cv[8]="SWANSEA CITY";cv[9]="SCHALKE";cv[10]="MANCHESTER CITY";cv[11]="BOLTON WANDERERS";cv[12]="ASTON VILLA";cv[13]="SPORTING LISBON";
        cv[14]="ARSENAL";cv[15]="CRYSTAL PALACE";cv[16]="MARLBOR";cv[17]="MANCHESTER UNITED";cv[18]="SHREWSBURY TOWN";cv[19]="QUEENS PARK RANGERS";cv[20]="MARLBOR";
        cv[21]="LIVERPOOL";cv[22]="WEST BROMWICH ALBION";cv[23]="SCHALKE";cv[24]="SUNDERLAND";cv[25]="TOTTENHAM HOTSPUR";cv[26]="NEWCASTLE UNITED";
        cv[27]="SPORTING LISBBON";cv[28]="HULL CITY";cv[29]="DERBY COUNTY";cv[30]="STOKE CITY";cv[31]="WEST HAM UNITED";cv[32]="SOUTHAMPTON";
        cv[33]="TOTTENHAM HOTSPUT";cv[34]="WATFORD";cv[35]="NEWCASTLE UNITED";cv[36]="SWANSEA CITY";cv[37]="LIVERPOOL";cv[38]="BADFORD CITY";cv[39]="LIVERPOOL";
        cv[40]="MANCHESTERCITY";cv[41]="ASTON VILLA";cv[42]="EVERTON";cv[43]="PARIS ST.GERMAN";cv[44]="BURNLEY";cv[45]="TOTTENHAM HOTSPUR";cv[46]="WEST HAM UNITED";
        cv[47]="PARIS ST.GERMAN";cv[48]="SOUTHAMPTON";cv[49]="HULL CITY";cv[50]="STOKE CITY";cv[51]="QUEENS PARK RANGERS";cv[52]="MANCHESTER UNITED";cv[53]="ARSENAL";
        cv[54]="LEICESTER CITY";cv[55]="CRYSTAL PALACE";cv[56]="LIVERPOOL";cv[57]="WEST BROMWICH ALBION";cv[58]="SUNDERLAND";cv[59]="THAILAND ALL-STARS";
        cv[60]="SYDNEY FC";
        cr[0]=1;cr[1]=0;cr[2]=1;cr[3]=-1;cr[4]=1;cr[5]=1;cr[6]=1;cr[7]=1;cr[8]=1;cr[9]=0;cr[10]=0;cr[11]=1;cr[12]=1;cr[13]=1;cr[14]=1;cr[15]=1;cr[16]=1;cr[17]=0;
        cr[18]=1;cr[19]=1;cr[20]=0;cr[21]=1;cr[22]=1;cr[23]=1;cr[24]=0;cr[25]=1;cr[26]=1;cr[27]=1;cr[28]=1;cr[29]=1;cr[30]=1;cr[31]=1;cr[32]=0;cr[33]=-1;cr[34]=1;
        cr[35]=1;cr[36]=1;cr[37]=0;cr[38]=-1;cr[39]=1;cr[40]=0;cr[41]=1;cr[42]=1;cr[43]=0;cr[44]=0;cr[45]=1;cr[46]=1;cr[47]=0;cr[48]=0;cr[49]=1;cr[50]=1;cr[51]=1;
        cr[52]=1;cr[53]=0;cr[54]=1;cr[55]=1;cr[56]=0;cr[57]=-1;cr[58]=1;cr[59]=1;cr[60]=1;
        
        
        

        lv[0]="BRONDBY";lv[1]="PRESTON NORTH END";lv[2]="ROMA";lv[3]="OLYMPLAKOS FC";lv[4]="MACHESTER CITY";lv[5]="AC MILAN";lv[6]="MANCHESTER UNITED";
        lv[7]="BORUSSIA DORTMUND";lv[8]="SOUTHAMPTON";lv[9]="MANCHESTER CITY";lv[10]="TOTTENHAM HOTSPUR";lv[11]="ASTON VILLA";lv[12]="LUDOGORETS";
        lv[13]="WEST HAM UNITED";lv[14]="MIDDLESBROUGH";lv[15]="EVERTON";lv[16]="BASEL";lv[17]="WEST BROMWICH ALBION";lv[18]="QUEENS PARK RANGERS";
        lv[19]="REAL MADRID";lv[20]="HULL CITY";lv[21]="SWANSEA CITY";lv[22]="NEWCASTLE UNITED";lv[23]="REAL MADRID";lv[24]="CHEALSEA";lv[25]="RYSTAL PALACE";
        lv[26]="LUDOGORETS";lv[27]="STOKE CITY";lv[28]="LEICESTER CITY";lv[29]="SUNDERLAND";lv[30]="BASEL";lv[31]="MANCHESTER UNITED";lv[32]="BOUREMOUTH";
        lv[33]="ARSENAL";lv[34]="BURNLEY";lv[35]="SWANSEA CITY";lv[36]="LEICESTER CITY";lv[37]="AFC WIMBELDON";lv[38]="SUNDERLAND";lv[39]="ASTON VILLA";
        lv[40]="CHEALSEA";lv[41]="BOLTON WANDERERS";lv[42]="CHEALSEA";lv[43]="WESTHAM UNITED";lv[44]="BOLTON WANDERERS";lv[45]="EVERTON";lv[46]="TOTTENHAM HOTSPUR";
        lv[47]="CRYSTAL PALACE";lv[48]="BESLKTAS";lv[49]="SOUTHAMPTON";lv[50]="BESLKTAS";lv[51]="MACHESTER CITY";lv[52]="BURNLEY";lv[53]="BLACKBURN OVERS";
        lv[54]="SWANSEA CITY";lv[55]="MANCHESTER UNITED";lv[56]="ARSENAL";lv[57]="BLACKBURN ROVERS";lv[58]="NEWCASTLE UNITED";lv[59]="ASTON VILLA";
        lv[60]="WEST BROMWICH ALIBION";lv[61]="HULL CITY";lv[62]="QUEENS PARK RANGERS";lv[63]="CHEALSEA";lv[64]="CRYSTAL PALACE";lv[65]="STOKE CITY";
        lr[0]=-1;lr[1]=1;lr[2]=-1;lr[3]=1;lr[4]=0;lr[5]=1;lr[6]=-1;lr[7]=1;lr[8]=1;lr[9]=-1;lr[10]=1;lr[11]=-1;lr[12]=1;lr[13]=-1;lr[14]=1;lr[15]=0;lr[16]=-1;
        lr[17]=1;lr[18]=1;lr[19]=-1;lr[20]=0;lr[21]=1;lr[22]=-1;lr[23]=-1;lr[24]=-1;lr[25]=-1;lr[26]=0;lr[27]=1;lr[28]=1;lr[29]=0;lr[30]=0;lr[31]=-1;lr[32]=1;
        lr[33]=0;lr[34]=1;lr[35]=1;lr[36]=0;lr[37]=1;lr[38]=1;lr[39]=1; lr[40]=0;lr[41]=0;lr[42]=-1;lr[43]=1;lr[44]=1;lr[45]=0;lr[46]=1;lr[47]=1;lr[48]=1;lr[49]=1;
        lr[50]=-1;lr[51]=1;lr[52]=1;lr[53]=0;lr[54]=1;lr[55]=-1;lr[56]=-1;lr[57]=1;lr[58]=1;lr[59]=-1;lr[60]=0;lr[61]=-1;lr[62]=1;lr[63]=0;lr[64]=-1;lr[65]=-1;
        
        
        
        
        mcv[0]="DUNDEE";mcv[1]="HEARTS";mcv[2]="SPORTING KANSAS CITY";mcv[3]="AC MILAN";mcv[4]="LIVERPOOL";mcv[5]="OLYMPLAKOS FC";mcv[6]="ARSENAL";
        mcv[7]="NEWCASTLE UNITED";mcv[8]="LIVERPOOL";mcv[9]="STOKE CITY";mcv[10]="ARSENAL";mcv[11]="BAYERN MUNICH";mcv[12]="CHELSEA";mcv[13]="SHEFFIELD WEDNESDAY";
        mcv[14]="HULL CITY";mcv[15]="ROMA";mcv[16]="ASTON VILLA";mcv[17]="TOTTENHAM HOTSPUR";mcv[18]="CSKA MOSCOW";mcv[19]="WEST HAM UNITED";mcv[20]="NEWCASTLE UNITED";
        mcv[21]="MANCHESTER UNITED";mcv[22]="CSKA MOSCOW";mcv[23]="QUEENS PARK RANGER";mcv[24]="SWANSEA CITY";mcv[25]="BAYERN MUNICH";mcv[26]="SOUTHAMPTON";
        mcv[27]="SUNDERLAND";mcv[28]="EVERTON";mcv[29]="ROMA";mcv[30]="LEICESTER CITY";mcv[31]="CRYSTAL PALACE";mcv[32]="WEST BROMWICH ALBION";mcv[33]="BURNLEY";
        mcv[34]="SUNDERLAND";mcv[35]="SHEFFIELD WEDNESDAY";mcv[36]="EEVERTON";mcv[37]="ARSENAL";mcv[38]="MIDDLEBROUGH";mcv[39]="CHELSEA";mcv[40]="HULL CITY ";
        mcv[41]="STOKE CITY";mcv[42]="NEWCASTLE UNITED";mcv[43]="BARCELONA";mcv[44]="LIVERPOOL";mcv[45]="LEICESTER CITY";mcv[46]="BURNLEY";mcv[47]="BARCELONA";
        mcv[48]="WESTBROM ALBION";mcv[49]="CRYSTAL PALACE";mcv[50]="MACHESTER UNITED";mcv[51]="WEST HAM UNITED";mcv[52]="ASTON VILLA";mcv[53]="TOTTENHAM HOTSPUR";
        mcv[54]="QUEENS PARK RANGERS";mcv[55]="SWANSEA CITY";mcv[56]="SOTHAMPTON";
        mcr[0]=-1;mcr[1]=1;mcr[2]=1;mcr[3]=1;mcr[4]=0;mcr[5]=0;mcr[6]=-1;mcr[7]=1;mcr[8]=1;mcr[9]=-1;mcr[10]=0;mcr[11]=-1;mcr[12]=0;mcr[13]=1;mcr[14]=1;mcr[15]=0;
        mcr[16]=1;mcr[17]=1;mcr[18]=0;mcr[19]=-1;mcr[20]=-1;mcr[21]=1;mcr[22]=-1;mcr[23]=0;mcr[24]=1;mcr[25]=1;mcr[26]=1;mcr[27]=1;mcr[28]=1;mcr[29]=1;mcr[30]=1;
        mcr[31]=1;mcr[32]=1;mcr[33]=0;mcr[34]=1;mcr[35]=1;mcr[36]=0;mcr[37]=-1;mcr[38]=-1;mcr[39]=0;mcr[40]=0;mcr[41]=1;mcr[42]=1;mcr[43]=-1;mcr[44]=-1;mcr[45]=1;
        mcr[46]=-1;mcr[47]=-1;mcr[48]=1;mcr[49]=-1;mcr[50]=-1; mcr[51]=1;mcr[52]=1;mcr[53]=1;mcr[54]=1;mcr[55]=1;mcr[56]=1;
        
        
        
                       
        muv[0]="LOS ANGELES GALXY";muv[1]="ROMA";muv[2]="INTER MILAN";muv[3]="REAL MADRID";muv[4]="LIVERPOOL";muv[5]="VALENCIA";muv[6]="SWANSEA CITY";
        muv[7]="SUNDERLAND";muv[8]="MILTON KEYNES DONS";muv[9]="BURNLEY";muv[10]="QUEENS PARK RANGERS";muv[11]="LEICESTER CITY";muv[12]="WEST HAM UNITED";
        muv[13]="EVERTON";muv[14]="WEST BROMWICH ALBION";muv[15]="CHELSEA";muv[16]="MANCHESTER CITY";muv[17]="CRYSTAL PALACE";muv[18]="ARSENAL";muv[19]="HULL CITY";
        muv[20]="STOKE CITY";muv[21]="SOUTHAMPTON";muv[22]="LIVERPOOL";muv[23]="ASTON VILLA";muv[24]="NEWCASTLE UNITED";muv[25]="TOTTENHAM HOTSPUR";
        muv[26]="STOKE CITY";muv[27]="YEOVIL TOWN";muv[28]="SOTHAMPTON";muv[29]="QUEENS PARK RANGERS";muv[30]="CAMBRIDGE UNITED";muv[31]="LEICESTER CITY";
        muv[32]="CAMBRIDGE UNITED";muv[33]="WESTHAM UNITED";muv[34]="BURNLEY";muv[35]="PRESTON NORTH END";muv[36]="SWANSEA CITY";muv[37]="SUNDERLAND";
        muv[38]="NEWCASTLE UNITED";muv[39]="ARSENAL";muv[40]="TOTTENHAM HOTSPUR";muv[41]="LIVERPOOL";muv[42]="ASTON VILLA";muv[43]="MANCHESTER CITY";
        muv[44]="CHEALSEA";muv[45]="EVERTON";muv[46]="WEST BROMWICH ALBION";muv[47]="CRYSTAL PALACE";muv[48]="ARSENAL";muv[49]="HULL CITY";        
        mur[0]=1;mur[1]=1;mur[2]=0;mur[3]=1;mur[4]=1;mur[5]=1;mur[6]=-1;mur[7]=0;mur[8]=-1;mur[9]=0;mur[10]=1;mur[11]=-1;mur[12]=1;mur[13]=1;mur[14]=0;mur[15]=0;
        mur[16]=-1;mur[17]=1;mur[18]=1;mur[19]=1;mur[20]=1;mur[21]=1;mur[22]=1;mur[23]=0;mur[24]=1;mur[25]=0;mur[26]=0;mur[27]=1;mur[28]=-1;mur[29]=1;mur[30]=0;
        mur[31]=1;mur[32]=1;mur[33]=0;mur[34]=1;mur[35]=1;mur[36]=-1;mur[37]=1;mur[38]=1;mur[39]=-1;mur[40]=1;mur[41]=1;mur[42]=1;mur[43]=1;mur[44]=-1;mur[45]=-1;
        mur[46]=-1;mur[47]=1;mur[48]=0;mur[49]=0;
        
        
        
        
        pv[0]="REIMS";pv[1]="BASTLA";pv[2]="EVLAN THONON GALILLAR";pv[3]="ST ETLENNE";pv[4]="RENNES";pv[5]="AJAX";pv[6]="LYON";pv[7]="CAEN";pv[8]="TOULOUSE";
        pv[9]="BARCELONA";pv[10]="MONACO";pv[11]="RC LENS";pv[12]="APOEL NICOSLA";pv[13]="BORDEAUX";pv[14]="LORIENT";pv[15]="APOEL NICOSLA";pv[16]="MARSELLE";
        pv[17]="METZ";pv[18]="AJAX";pv[19]="NICE";pv[20]="LILLE";pv[21]="NANTES";pv[22]="BARCELONA";pv[23]="GULNGAMP";pv[24]="MONTPELLER";pv[25]="BASTLA";
        pv[26]="EVLAN THONON GALILLAR";pv[27]="ST ETLENNE";pv[28]="RENNES";pv[29]="LYON";pv[30]="CAEN";pv[31]="CHELSEA";pv[32]="TOULOUSE";pv[33]="MONACO";
        pv[34]="RC LENS";pv[35]="CHELSEA";pv[36]="BORDEAUX";pv[37]="LORIENT";pv[38]="MARSELLE";pv[39]="ST ETLENNE";pv[40]="BARCELONA";pv[41]="NICE";
        pv[42]="BARCELONA";pv[43]="LILLE";pv[44]="MERTZ";pv[45]="NANTES";pv[46]="GUINGAMP";pv[47]="MONTPELLER";pv[48]="REIMS";pv[49]="AUXERRE";
        pr[0]=0;pr[1]=1;pr[2]=0;pr[3]=1;pr[4]=0;pr[5]=0;pr[6]=0;pr[7]=1;pr[8]=0;pr[9]=1;pr[10]=0;pr[11]=1;pr[12]=1;pr[13]=1;pr[14]=1;pr[15]=1;pr[16]=1;pr[17]=1;
        pr[18]=1;pr[19]=1;pr[20]=0;pr[21]=1;pr[22]=-1;pr[23]=-1;pr[24]=0;pr[25]=-1;pr[26]=1;pr[27]=1;pr[28]=1;pr[29]=0;pr[30]=0;pr[31]=0;pr[32]=1;pr[33]=0;pr[34]=1;
        pr[35]=0;pr[36]=-1;pr[37]=1;pr[38]=1;pr[39]=1;pr[40]=-1;pr[41]=1;pr[42]=-1;pr[43]=1;pr[44]=1;pr[45]=1;pr[46]=1;pr[47]=1;pr[48]=1;pr[49]=1;
        
        
        
        
        rv[0]="INTER MILAN";rv[1]="ROMA";rv[2]="MANCHETER UNITD";rv[3]="SEVILLA";rv[4]="ATHELETICO MADRID";rv[5]="ATHELETICO MADRID";rv[6]="CORDOBA";
        rv[7]="REAL SOCIEDAD";rv[8]="ATHELETICO MADRID";rv[9]="BASEL";rv[10]="DEPORTLVO LA CORUNA";rv[11]="ELCHE";rv[12]="VILLARREAL";rv[13]="LUDOGORETS";
        rv[14]="ATHELETIC BILBAO";rv[15]="LEVANTE";rv[16]="LIVERPOOL";rv[17]="BARCELONA";rv[18]="UD CORNELLA";rv[19]="GRANADA";rv[20]="LIVERPOOL";
        rv[21]="RAYO VALLECANO";rv[22]="EIBAR";rv[23]="BASEL";rv[24]="MALAGA";rv[25]="UD CORNELLA";rv[26]="CELTA VIGO";rv[27]="LUDOGORETS";rv[28]="ALMERIA";
        rv[29]="CRUZ AZUL";rv[30]="SAN LORENZO";rv[31]="VALENCIA";rv[32]="ATHELETICO MADRID";rv[33]="ESPANYOL";rv[34]="ATHELETICO MADRID";rv[35]="GETAFE";
        rv[36]="CORDOBA";rv[37]="REAL SOCIEDAD";rv[38]="SEVILLA";rv[39]="ATHELETICO MADRID";rv[40]="DEPORTLVO LA CORUNA";rv[41]="SCHALKE";rv[42]="ELCHE";
        rv[43]="VILLARREAL";rv[44]="ATHELETIC BILBAO";rv[45]="SCHALKE";rv[46]="LEVANTE";rv[47]="BARCELONA";rv[48]="GRANADA";rv[49]="RAYO VALLECANO";
        rv[50]="EIBAR";rv[51]="ATHELETICO MADRID";rv[52]="MALAGA";rv[53]="ATHELETICO MADRID";rv[54]="CELTO VIGO";rv[55]="ALMERIA";rv[56]="SEVILLA";
        rv[57]="JUVENTUS";rv[58]="VALENCIA";rv[59]="JUVENTUS";rv[60]="ESPANYOL";rv[61]="GETAFE";
        rr[0]=0;rr[1]=-1;rr[2]=-1;rr[3]=1;rr[4]=0;rr[5]=-1;rr[6]=1;rr[7]=-1;rr[8]=-1;rr[9]=1;rr[10]=1;rr[11]=1;rr[12]=1;rr[13]=1;rr[14]=1;rr[15]=1;rr[16]=1;rr[17]=1;
        rr[18]=1;rr[19]=1;rr[20]=1;rr[21]=1;rr[22]=1;rr[23]=1;rr[24]=1;rr[25]=1;rr[26]=1;rr[27]=1;rr[28]=1;rr[29]=1;rr[30]=1;rr[31]=1;rr[32]=-1;rr[33]=-1;rr[34]=1;
        rr[35]=0;rr[36]=1;rr[37]=1;rr[38]=1;rr[39]=-1;rr[40]=1;rr[41]=1;rr[42]=1;rr[43]=0;rr[44]=-1;rr[45]=-1;rr[46]=1;rr[47]=-1;rr[48]=1;rr[49]=1;rr[50]=1;rr[51]=0;
        rr[52]=1;rr[53]=1;rr[54]=1;rr[55]=1;rr[56]=1;rr[57]=-1;rr[58]=0;rr[59]=0;rr[60]=1;rr[61]=1;
        
        
        

        wv[0]="CARDIFF CITY";wv[1]="BAYERN MUNICH";wv[2]="ELNTRACHT FRANKFURT";wv[3]="HOFFENHELM";wv[4]="EVERTON";wv[5]="BAYER LEVERKUSEN";wv[6]="HERTHA BERLIN";
        wv[7]="WERDER BERMEN";wv[8]="LILLE";wv[9]="FC AUGSBURG";wv[10]="SC FRELBURG";wv[11]="KRASNODAR";wv[12]="MAINZ";wv[13]="STUTTGART";wv[14]="KRASNODAR";
        wv[15]="HAMBURG";wv[16]="SCHALKE";wv[17]="EVERTON";wv[18]="BORUSSIA MONCHEGLADBACH";wv[19]="HANNOVER 96";wv[20]="LILLE";wv[21]="SC PADERBORN 07";
        wv[22]="BORUSSIA DOTMUND";wv[23]="COLOGNE";wv[24]="BAYERN MUNICH";wv[25]="ELNTRACHT FRANKFURT";wv[26]="HOFFENHELM";wv[27]="BAYER LEVERKUSEN";
        wv[28]="SPORTING LISBON";wv[29]="HERTHA BERLIN";wv[30]="SPORTING LISBON";wv[31]="WERDER BERLIN";wv[32]="RB LELPZIG";wv[33]="FC AUGSBERG";wv[34]="INTER MILAN";
        wv[35]="SC FRELBURG";wv[36]="INTER MILAN";wv[37]="MAINZ";wv[38]="STUTTGART";wv[39]="SC FRELBURG";wv[40]="HAMBURG";wv[41]="NAPOLI";wv[42]="SCHALKE";
        wv[43]="NAPOLI";wv[44]="BORUSSIA MONCHENGLADBACH";wv[45]="ARMINIA BIELFELD";wv[46]="HANNOVER 96";wv[47]="SC PADERSON 07";wv[48]="BORUSSIA DORTMUND";
        wv[49]="COLOGNE";
        wr[0]=0;wr[1]=1;wr[2]=0;wr[3]=0;wr[4]=-1;wr[5]=1;wr[6]=-1;wr[7]=1;wr[8]=0;wr[9]=1;wr[10]=1;wr[11]=1;wr[12]=1;wr[13]=1;wr[14]=1;wr[15]=1;wr[16]=-1;wr[17]=-1;
        wr[18]=1;wr[19]=1;wr[20]=1;wr[21]=0;wr[22]=0;wr[23]=1;wr[24]=1;wr[25]=0;wr[26]=1;wr[27]=1;wr[28]=1;wr[29]=1;wr[30]=0;wr[31]=1;wr[32]=1;wr[33]=-1;wr[34]=1;
        wr[35]=1;wr[36]=1;wr[37]=0;wr[38]=1;wr[39]=1;wr[40]=1;wr[41]=-1;wr[42]=0;wr[43]=0;wr[44]=-1;wr[45]=1;wr[46]=0;wr[47]=1;wr[48]=1;wr[49]=0;

        System.out.println("WELCOME TO SPECIFIC TEAM PREDICTIONS");
        System.out.println("YOU HAVE: "+acc+" COINS TO PLAY WITH");
        if(tc=='b')
        {
            while(true)
            {
                int mn=(int)Math.floor(Math.random() * 60) + 1;
                System.out.println("BARCELONA V/S "+bv[mn]);
                System.out.println("if bet for BARCALONA press 1, if against press -1,for draw press 0"); 
                int c=sc.nextInt();
                System.out.println("BARCALONA V/S "+bv[mn]);
                if(br[mn]==1)
                    System.out.println("BARCALONA wins");
                else if(br[mn]==-1)
                    System.out.println("BARCALONA looses");
                else
                    System.out.println("DRAW");
                if(c==br[mn]){
                    System.out.println("you Win");
                    acc+=50;
                    cntr++;
                    System.out.println("YOU HAVE "+acc);
                }
                else
                {
                    System.out.println("you loose");
                    acc-=50;
                    System.out.println("YOU HAVE"+acc);

                }
                System.out.println("DO YOU WANT To PLAY AGAIN IF YES PRESS 'y' ELSE PRESS 'n' TO PLAY WITH ANOTHER TEAM PRESS 't'");
                String s=sc.next();
                char  ch=s.charAt(0);
                if(ch=='y' || ch=='Y'){
                    System.out.println("YOU HAVE "+acc);
                    System.out.println("\f");
                    continue;
                }
                else if(ch=='n' || ch=='N')
                {
                    System.out.println("\f");
                    System.out.println("-----------------------------THANK YOU FOR PLAYING--------------------------------");
                    System.out.println("CONGRTULATIONS YOU HAVE WON     "+acc);
                    System.out.println("NO OF RIGHT RIGHT PREDICTIONS WERE:- "+cntr);
                    tc=0;
                    acc=0;
                    cntr=0;
                    System.exit(0);
                    break;
                }
                else if(ch=='t')
                {
                    System.out.println("\f");
                    tc=0;
                    teamselecter(0);
                }

            }
        }
        if(tc=='a')
        {
            while(true)
            {
                int mn=(int)Math.floor(Math.random() * 59) + 1;
                System.out.println("ARSENAL V/S "+av[mn]);
                System.out.println("if bet for ARSENAL press 1, if against press -1,for draw press 0"); 
                int c=sc.nextInt();
                System.out.println("ARSENAL V/S "+av[mn]);
                if(ar[mn]==1)
                    System.out.println("ARSENAL wins");
                else if(ar[mn]==-1)
                    System.out.println("ARSENAL looses");
                else
                    System.out.println("DRAW");
                if(c==ar[mn]){
                    System.out.println("you Win");
                    acc+=50;
                    cntr++;
                    System.out.println("YOU HAVE "+acc);
                }
                else
                {
                    System.out.println("you loose");
                    acc-=50;
                    System.out.println("YOU HAVE"+acc);

                }
                System.out.println("DO YOU WANT To PLAY AGAIN IF YES PRESS 'y' ELSE PRESS 'n' TO PLAY WITH ANOTHER TEAM PRESS 't'");
                String s=sc.next();
                char  ch=s.charAt(0);
                if(ch=='y' || ch=='Y'){
                    System.out.println("YOU HAVE "+acc);
                    System.out.println("\f");
                    continue;
                }
                else if(ch=='n' || ch=='N')
                {
                    System.out.println("\f");
                    System.out.println("-----------------------------THANK YOU FOR PLAYING--------------------------------");
                    System.out.println("CONGRTULATIONS YOU HAVE WON     "+acc);
                    System.out.println("NO OF RIGHT RIGHT PREDICTIONS WERE:- "+cntr);
                    tc=0;
                    acc=0;
                    cntr=0;
                    System.exit(0);
                    break;
                }
                else if(ch=='t')
                {
                    System.out.println("\f");
                    tc=0;
                    teamselecter(0);
                }
            }
        }
        if(tc=='l')
        {
            while(true)
            {
                int mn=(int)Math.floor(Math.random() * 65) + 1;
                System.out.println("Liverpool V/S "+lv[mn]);
                System.out.println("if bet for LIVERPPOOL press 1, if against press -1,for draw press 0"); 
                int c=sc.nextInt();
                System.out.println("LIVERPOOL V/S "+lv[mn]);
                if(lr[mn]==1)
                    System.out.println("LIVERPOOL wins");
                else if(lr[mn]==-1)
                    System.out.println("LIVERPOOL looses");
                else
                    System.out.println("DRAW");
                if(c==lr[mn]){
                    System.out.println("you Win");
                    acc+=50;
                    cntr++;
                    System.out.println("YOU HAVE "+acc);
                }
                else
                {
                    System.out.println("you loose");
                    acc-=50;
                    System.out.println("YOU HAVE"+acc);

                }
                System.out.println("DO YOU WANT To PLAY AGAIN IF YES PRESS 'y' ELSE PRESS 'n' TO PLAY WITH ANOTHER TEAM PRESS 't'");
                String s=sc.next();
                char  ch=s.charAt(0);
                if(ch=='y' || ch=='Y'){
                    System.out.println("YOU HAVE "+acc);
                    System.out.println("\f");
                    continue;
                }
                else if(ch=='n' || ch=='N')
                {
                    System.out.println("\f");
                    System.out.println("-----------------------------THANK YOU FOR PLAYING--------------------------------");
                    System.out.println("CONGRTULATIONS YOU HAVE WON     "+acc);
                    System.out.println("NO OF RIGHT RIGHT PREDICTIONS WERE:- "+cntr);
                    acc=0;
                    cntr=0;
                    System.exit(0);
                    break;
                }
                else if(ch=='t')
                {
                    System.out.println("\f");
                    tc=0;
                    teamselecter(0);
                }
            }
        }
        if(tc=='m')
        {
            while(true)
            {
                int mn=(int)Math.floor(Math.random() * 56) + 1;
                System.out.println("MANCHESTER CITY V/S "+mcv[mn]);
                System.out.println("if bet for MANCHESTER CITY press 1, if against press -1,for draw press 0"); 
                int c=sc.nextInt();
                System.out.println("MANCHESTER CITY V/S "+mcv[mn]);
                if(mcr[mn]==1)
                    System.out.println("MANCHESTER CITY wins");
                else if(mcr[mn]==-1)
                    System.out.println("MANCHESTER CITY looses");
                else
                    System.out.println("DRAW");
                if(c==mcr[mn]){
                    System.out.println("you Win");
                    acc+=50;
                    cntr++;
                    System.out.println("YOU HAVE "+acc);
                }
                else
                {
                    System.out.println("you loose");
                    acc-=50;
                    System.out.println("YOU HAVE"+acc);

                }
                System.out.println("DO YOU WANT To PLAY AGAIN IF YES PRESS 'y' ELSE PRESS 'n' TO PLAY WITH ANOTHER TEAM PRESS 't'");
                String s=sc.next();
                char  ch=s.charAt(0);
                if(ch=='y' || ch=='Y'){
                    System.out.println("YOU HAVE "+acc);
                    System.out.println("\f");
                    continue;
                }
                else if(ch=='n' || ch=='N')
                {
                    System.out.println("\f");
                    System.out.println("-----------------------------THANK YOU FOR PLAYING--------------------------------");
                    System.out.println("CONGRTULATIONS YOU HAVE WON     "+acc);
                    System.out.println("NO OF RIGHT RIGHT PREDICTIONS WERE:- "+cntr);
                    tc=0;
                    acc=0;
                    cntr=0;
                    System.exit(0);
                    break;
                }
                else if(ch=='t')
                {
                    System.out.println("\f");
                    tc=0;
                    teamselecter(0);
                }
            }
        }
        if(tc=='p')
        {
            while(true)
            {
                int mn=(int)Math.floor(Math.random() * 49) + 1;
                System.out.println("PARIS ST.GERMAN V/S "+pv[mn]);
                System.out.println("if bet for PARIS ST.GERMAN press 1, if against press -1,for draw press 0"); 
                int c=sc.nextInt();
                System.out.println("PARIS ST.GERMAN V/S "+pv[mn]);
                if(pr[mn]==1)
                    System.out.println("PARIS ST.GERMAN wins");
                else if(pr[mn]==-1)
                    System.out.println("PARIS ST.GERMAN looses");
                else
                    System.out.println("DRAW");
                if(c==pr[mn]){
                    System.out.println("you Win");
                    acc+=50;
                    cntr++;
                    System.out.println("YOU HAVE "+acc);
                }
                else
                {
                    System.out.println("you loose");
                    acc-=50;
                    System.out.println("YOU HAVE"+acc);

                }
                System.out.println("DO YOU WANT To PLAY AGAIN IF YES PRESS 'y' ELSE PRESS 'n' TO PLAY WITH ANOTHER TEAM PRESS 't'");
                String s=sc.next();
                char  ch=s.charAt(0);
                if(ch=='y' || ch=='Y'){
                    System.out.println("YOU HAVE "+acc);
                    System.out.println("\f");
                    continue;
                }
                else if(ch=='n' || ch=='N')
                {
                    System.out.println("\f");
                    System.out.println("-----------------------------THANK YOU FOR PLAYING--------------------------------");
                    System.out.println("CONGRTULATIONS YOU HAVE WON     "+acc);
                    System.out.println("NO OF RIGHT RIGHT PREDICTIONS WERE:- "+cntr);
                    tc=0;
                    acc=0;
                    cntr=0;
                    System.exit(0);
                    break;

                }
                else if(ch=='t')
                {
                    System.out.println("\f");
                    tc=0;
                    teamselecter(0);
                }
            }
        }
        if(tc=='B')
        {
            while(true)
            {
                int mn=(int)Math.floor(Math.random() * 49) + 1;
                System.out.println("BAYERN MUNICH V/S "+bmv[mn]);
                System.out.println("if bet for BAYERN MUNICH press 1, if against press -1,for draw press 0"); 
                int c=sc.nextInt();
                System.out.println("BAYERN MUNICH V/S "+bmv[mn]);
                if(bmr[mn]==1)
                    System.out.println("BAYERN MUNICH wins");
                else if(bmr[mn]==-1)
                    System.out.println("BAYERN MUNICH looses");
                else
                    System.out.println("DRAW");
                if(c==bmr[mn]){
                    System.out.println("you Win");
                    acc+=50;
                    cntr++;
                    System.out.println("YOU HAVE "+acc);
                }
                else
                {
                    System.out.println("you loose");
                    acc-=50;
                    System.out.println("YOU HAVE"+acc);

                }
                System.out.println("DO YOU WANT To PLAY AGAIN IF YES PRESS 'y' ELSE PRESS 'n' TO PLAY WITH ANOTHER TEAM PRESS 't'");
                String s=sc.next();
                char  ch=s.charAt(0);
                if(ch=='y' || ch=='Y'){
                    System.out.println("YOU HAVE "+acc);
                    System.out.println("\f");
                    continue;
                }
                else if(ch=='n' || ch=='N')
                {
                    System.out.println("\f");
                    System.out.println("-----------------------------THANK YOU FOR PLAYING--------------------------------");
                    System.out.println("CONGRTULATIONS YOU HAVE WON     "+acc);
                    System.out.println("NO OF RIGHT RIGHT PREDICTIONS WERE:- "+cntr);
                    tc=0;
                    acc=0;
                    cntr=0;
                    System.exit(0);
                    break;
                }
                else if(ch=='t')
                {
                    System.out.println("\f");
                    tc=0;
                    teamselecter(0);
                }
            }
        }
        if(tc=='r')
        {
            while(true)
            {
                int mn=(int)Math.floor(Math.random() * 61) + 1;
                System.out.println("REAL MADRID V/S "+rv[mn]);
                System.out.println("if bet for REAL MADRID press 1, if against press -1,for draw press 0"); 
                int c=sc.nextInt();
                System.out.println("REAL MADRID V/S "+rv[mn]);
                if(rr[mn]==1)
                    System.out.println("REAL MADRID wins");
                else if(rr[mn]==-1)
                    System.out.println("REAL MADRID looses");
                else
                    System.out.println("DRAW");
                if(c==rr[mn]){
                    System.out.println("you Win");
                    acc+=50;
                    cntr++;
                    System.out.println("YOU HAVE "+acc);
                }
                else
                {
                    System.out.println("you loose");
                    acc-=50;
                    System.out.println("YOU HAVE"+acc);

                }
                System.out.println("DO YOU WANT To PLAY AGAIN IF YES PRESS 'y' ELSE PRESS 'n' TO PLAY WITH ANOTHER TEAM PRESS 't'");
                String s=sc.next();
                char  ch=s.charAt(0);
                if(ch=='y' || ch=='Y'){
                    System.out.println("YOU HAVE "+acc);
                    System.out.println("\f");
                    continue;
                }
                else if(ch=='n' || ch=='N')
                {
                    System.out.println("\f");
                    System.out.println("-----------------------------THANK YOU FOR PLAYING--------------------------------");
                    System.out.println("CONGRTULATIONS YOU HAVE WON     "+acc);
                    System.out.println("NO OF RIGHT RIGHT PREDICTIONS WERE:- "+cntr);
                    tc=0;
                    acc=0;
                    cntr=0;
                    System.exit(0);
                    break;
                }
                else if(ch=='t')
                {
                    System.out.println("\f");
                    tc=0;
                    teamselecter(0);
                }
            }
        }
        if(tc=='c')
        {
            while(true)
            {
                int mn=(int)Math.floor(Math.random() * 60) + 1;
                System.out.println("CHEALSEA V/S "+cv[mn]);
                System.out.println("if bet for CHEALSEA press 1, if against press -1,for draw press 0"); 
                int c=sc.nextInt();
                System.out.println("CHEALSEA V/S "+cv[mn]);
                if(cr[mn]==1)
                    System.out.println("CHEALSEA wins");
                else if(cr[mn]==-1)
                    System.out.println("CHEALSEA looses");
                else
                    System.out.println("DRAW");
                if(c==cr[mn]){
                    System.out.println("you Win");
                    acc+=50;
                    cntr++;
                    System.out.println("YOU HAVE "+acc);
                }
                else
                {
                    System.out.println("you loose");
                    acc-=50;
                    System.out.println("YOU HAVE"+acc);

                }
                System.out.println("DO YOU WANT To PLAY AGAIN IF YES PRESS 'y' ELSE PRESS 'n' TO PLAY WITH ANOTHER TEAM PRESS 't'");
                String s=sc.next();
                char  ch=s.charAt(0);
                if(ch=='y' || ch=='Y'){
                    System.out.println("YOU HAVE "+acc);
                    System.out.println("\f");
                    continue;
                }
                else if(ch=='n' || ch=='N')
                {
                    System.out.println("\f");
                    System.out.println("-----------------------------THANK YOU FOR PLAYING--------------------------------");
                    System.out.println("CONGRTULATIONS YOU HAVE WON     "+acc);
                    System.out.println("NO OF RIGHT RIGHT PREDICTIONS WERE:- "+cntr);
                    tc=0;
                    acc=0;
                    cntr=0;
                    System.exit(0);
                    break;
                }
                else if(ch=='t')
                {
                    System.out.println("\f");
                    tc=0;
                    teamselecter(0);
                }
            }
        }
        if(tc=='M')
        {
            while(true)
            {
                int mn=(int)Math.floor(Math.random() * 49) + 1;
                System.out.println("MANCHESTER UNITED V/S "+muv[mn]);
                System.out.println("if bet for MANCHESTER UNITED press 1, if against press -1,for draw press 0"); 
                int c=sc.nextInt();
                System.out.println("MANCHESTER UNITED V/S "+muv[mn]);
                if(mur[mn]==1)
                    System.out.println("MANCHESTER UNITED wins");
                else if(mur[mn]==-1)
                    System.out.println("MANCHESTER UNITED looses");
                else
                    System.out.println("DRAW");
                if(c==mur[mn]){
                    System.out.println("you Win");
                    acc+=50;
                    cntr++;
                    System.out.println("YOU HAVE "+acc);
                }
                else
                {
                    System.out.println("you loose");
                    acc-=50;
                    System.out.println("YOU HAVE"+acc);

                }
                System.out.println("DO YOU WANT To PLAY AGAIN IF YES PRESS 'y' ELSE PRESS 'n' TO PLAY WITH ANOTHER TEAM PRESS 't'");
                String s=sc.next();
                char  ch=s.charAt(0);
                if(ch=='y' || ch=='Y'){
                    System.out.println("YOU HAVE "+acc);
                    System.out.println("\f");
                    continue;
                }
                else if(ch=='n' || ch=='N')
                {
                    System.out.println("\f");
                    System.out.println("-----------------------------THANK YOU FOR PLAYING--------------------------------");
                    System.out.println("CONGRTULATIONS YOU HAVE WON     "+acc);
                    System.out.println("NO OF RIGHT RIGHT PREDICTIONS WERE:- "+cntr);
                    tc=0;
                    acc=0;
                    cntr=0;
                    System.exit(0);
                    break;
                }
                else if(ch=='t')
                {
                    System.out.println("\f");
                    tc=0;
                    teamselecter(0);
                }
            }
        }
        if(tc=='w')
        {
            while(true)
            {
                int mn=(int)Math.floor(Math.random() * 49) + 1;
                System.out.println("wolfsburg V/S "+wv[mn]);
                System.out.println("if bet for WOLFSBURG press 1, if against press -1,for draw press 0"); 
                int c=sc.nextInt();
                System.out.println("WOLFSBURG V/S "+wv[mn]);
                if(wr[mn]==1)
                    System.out.println("WOLFSBURG wins");
                else if(wr[mn]==-1)
                    System.out.println("WOLFSBURG looses");
                else
                    System.out.println("DRAW");
                if(c==wr[mn]){
                    System.out.println("you Win");
                    acc+=50;
                    cntr++;
                    System.out.println("YOU HAVE "+acc);
                }
                else
                {
                    System.out.println("you loose");
                    acc-=50;
                    System.out.println("YOU HAVE"+acc);

                }
                System.out.println("DO YOU WANT To PLAY AGAIN IF YES PRESS 'y' ELSE PRESS 'n' TO PLAY WITH ANOTHER TEAM PRESS 't'");
                String s=sc.next();
                char  ch=s.charAt(0);
                if(ch=='y' || ch=='Y'){
                    System.out.println("YOU HAVE "+acc);
                    System.out.println("\f");
                    continue;
                }
                else if(ch=='n' || ch=='N')
                {
                    System.out.println("\f");
                    System.out.println("-----------------------------THANK YOU FOR PLAYING--------------------------------");
                    System.out.println("CONGRTULATIONS YOU HAVE WON     "+acc);
                    System.out.println("NO OF RIGHT RIGHT PREDICTIONS WERE:- "+cntr);
                    tc=0;
                    acc=0;
                    cntr=0;
                    System.exit(0);
                    break;
                }
                else if(ch=='t')
                {
                    System.out.println("\f");
                    tc=0;
                    teamselecter(0);
                }
            }
        }
    }

    void teamselecter(int z)//TO SELECT TEAM FOR GAME MODE SPECIFIC TEAM
    {
        Scanner sc=new Scanner(System.in);
        if(z==0)
        {
            System.out.println("                                                   CHOOSE THE TEAM WHOSE PREDICTION YOU WANT TO PLAY\n");
            System.out.println("BARCELONA PRESS 'b'                           \n");
            System.out.println("LIVERPOOL PRESS 'l'                           \n ");
            System.out.println("BAYERN MUNICH PRESS 'B'                       \n");
            System.out.println("CHEALSEA  PRESS 'c'                           \n");
            System.out.println("MANCHESTER UNITED PRESS 'M'                      \n");
            System.out.println("MANCHESTER CITY PRESS 'm'                         \n");
            System.out.println("WOLFBURG PRESS 'w'                           \n");
            System.out.println("ARSENAL PRESS 'a'                           \n");
            System.out.println("REAL MADRID PRESS 'r' \n");
            System.out.println("PARIS ST.GERMAN PRESS 'P'            \n");
            String st=sc.next();
            tc=st.charAt(0);
            specificteam(tc);
        }
        if(z==3)
        {
            System.out.println("NAME:-Parth Pancholi");
            System.out.println("Class:- Xll");
            System.out.println("SCHOOL:-Hutchings High School and Junior College");
            System.out.println("THIS IS MY COMPUTER PROJECT HOPE YOU LIKED IT.");

        }
    }

    void gamemode()//TO SELECT GAME MODE
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                                                                CHOOSE A GAME MODE    \n");
        System.out.println("                                                                FOR ALL TEAMS/ALL RAMDOM PRESS '1'      \n");
        System.out.println("                                                                SPECIFIC TEAM PRESS '0'      \n");
        System.out.println("                                                                ABOUT ME PRESS '3'            \n");
        int gm=sc.nextInt();
        if(gm==0 || gm==3)
            teamselecter(gm);
        else
            allrandom();
    }

    void allrandom()//GAME MODE ALL RANDOM
    {
        Scanner sc=new Scanner(System.in);
        av[0]="BOREHAM WOODS";av[1]="NEW YORK RED BULLS";av[2]="BENFICA";av[3]="MONACO";av[4]="MANCHESTER CITY";av[5]="CRYSTAL PALACEC";av[6]="BESLKTAS";
        av[7]="EVERTON";av[8]="BESLKTAS";av[9]="LEICESTER CITY";av[10]="MANCHESTER CITY";av[11]="BORUSSIA DORTMUND";av[12]="ASTON VILLA";av[13]="SOUTHAMPTON";
        av[14]="TOTTENHAM HOTSPUR";av[15]="GALATASARAY";av[16]="CHELSEA";av[17]="HULL CITY";av[18]="ANDERLECHT";av[19]="SUDERLAND";av[20]="BURNLEY";
        av[21]="ANDERLECHT";av[22]="SWANSEA CITY";av[23]="MANCHESTER UNITED";av[24]="BORUSSIA DORTMUND";av[25]="WEST BROMWICH ALBION";av[26]="SOUTHAMPTON";
        av[27]="STOKE CITY";av[28]="GALATASARAY";av[29]="NEWCASTLE UNITED";av[30]="LIVERPOOL";av[31]="QUEENS PARK RANGERS";av[32]="WEST HAM UNITED";
        av[33]="SOUTHAMPTON";av[34]="HULL CITY";av[35]="STOKE CITY";av[36]="MANCHESTER CITY";av[37]="BRIGHTON AND HOVE ALBION";av[38]="ASTON VILLA";
        av[39]="TOTTENHAM HOTSPUR";av[40]="LEICESTER CITY";av[41]="MIDDLESBROUGH";av[42]="CRYSTAL PALACE";av[43]="MONACO";av[44]="EVERTON";
        av[45]="QUEENS PARK RANGERS";av[46]="MANCHESTER UNITED";av[47]="WEST HAM UNITED";av[48]="MONACO";av[49]="NEWCASTLE UNITED";av[50]="LIVERPOOL";
        av[51]="BURNLEY";av[52]="READING";av[53]="CHELSEA";av[54]="HULL CITY";av[55]="SWANSEA CITY";av[56]="MANCHESTER UNITED";av[57]="SUNDERLAND";
        av[58]="WEST BROMWICH ALBION"; av[59]="ASTON VILLA";
        ar[0]=1;ar[1]=-1;ar[2]=1;ar[3]=-1;ar[4]=1;ar[5]=1;ar[6]=0;ar[7]=0;ar[8]=1;ar[9]=0;ar[10]=0;ar[11]=-1;ar[12]=1;ar[13]=-1;ar[14]=0;ar[15]=1;ar[16]=-1;
        ar[17]=0;ar[18]=1;ar[19]=1;ar[20]=1;ar[21]=0;ar[22]=-1;ar[23]=-1;ar[24]=1;ar[25]=1;ar[26]=1;ar[27]=-1;ar[28]=1;ar[29]=1;ar[30]=0;ar[31]=1;ar[32]=1;
        ar[33]=-1;ar[34]=1;ar[35]=1;ar[36]=1;ar[37]=1;ar[38]=1;ar[39]=-1;ar[40]=1;ar[41]=1;ar[42]=1;ar[43]=-1;ar[44]=1;ar[45]=1;ar[46]=1;ar[47]=1;ar[48]=1;
        ar[49]=1;ar[50]=1;ar[51]=1;ar[52]=1;ar[53]=0;ar[54]=1;ar[55]=-1;ar[56]=0;ar[57]=0;ar[58]=1;ar[59]=1;
        
        
        
        
        bv[0]="ELCE";bv[1]="VILLAREAL";bv[2]="ATHELETIC BILAO";bv[3]="APOEL NICOSLA";bv[4]="LEVANTE";bv[5]="MALAGA";bv[6]="GRANADA";bv[7]="PARIS ST.GERMAN";
        bv[8]="RAYA VALLECANA";bv[9]="EIBAR";bv[10]="AJAX";bv[11]="REAL MADRID";bv[12]="CELTA VIGO";bv[13]="AJAX";bv[14]="ALMERIA";bv[15]="SEVELLA";
        bv[16]="APOEL NICOSLA";bv[17]="VALENCIA";bv[18]="SD HUESCA";bv[19]="ESPANYAL";bv[20]="PARIS ST.GERMAN";bv[21]="GETAFE";bv[22]="SD HUESCA";bv[23]="CORDOBA";
        bv[24]="REAL SOCIEDAD";bv[25]="ELCA";bv[26]="ATHELETECO MADRID";bv[27]="ELCE";bv[28]="DEPORTIVO";bv[29]="ATHELETICO MADRID";bv[30]="ELCE";
        bv[31]="ATHELETICO MADRID";bv[32]="VILLAREAL";bv[33]="ATHELETIC BILBAO";bv[34]="VILLLAREAL";bv[35]="LEVANTE";bv[36]="MALAGA";bv[37]="MACHESTER CITY";
        bv[38]="GRANADA";bv[39]="VILLAREAL";bv[40]="RAYA VALLECANO";bv[41]="EIBAR";bv[42]="MANCHESTER CITY";bv[43]="REAL MADRID";bv[44]="CELTA VIGO";
        bv[45]="ALMERIA";bv[46]="SEVIALLA";bv[47]="PARIS ST.GERMAN";bv[48]="VALENCIA";bv[49]="PARIS ST.GERMAN";bv[50]="ESPANYOL";bv[51]="GETAFE";bv[52]="CORDOBA";
        bv[53]="BAYERN MUNICH";bv[54]="REAL SOCIEDAD";bv[55]="BAYERN MUNICH";bv[56]="ATHELETICO MADRID";bv[57]="DEPORTIVO";bv[58]="ATHELETICO BILBAO";bv[59]="JUVENTUS";
        br[0]=1;br[1]=1;br[2]=1;br[3]=1;br[4]=1;br[5]=0;br[6]=1;br[7]=-1;br[8]=1;br[9]=1;br[10]=1;br[11]=-1;br[12]=-1;br[13]=1;br[14]=1;br[15]=1;br[16]=1;
        br[17]=1;br[18]=1;br[19]=1;br[20]=1;br[21]=0;br[22]=1;br[23]=1;br[24]=-1;br[25]=1;br[26]=1;br[27]=1;br[28]=1;br[29]=1;br[30]=1;br[31]=1;br[32]=1;
        br[33]=1;br[34]=1;br[35]=1;br[36]=-1;br[37]=1;br[38]=1;br[39]=1;br[40]=1;br[41]=1;br[42]=1;br[43]=1;br[44]=1;br[45]=1;br[46]=0;br[47]=1;br[48]=1;
        br[49]=1;br[50]=1;br[51]=1;br[52]=1;br[53]=1;br[54]=1;br[55]=-1;br[56]=1;br[57]=0;br[58]=1;br[59]=1;
        
        
        
        
        bmv[0]="GUDLAJARA";bmv[1]="WOLFBURG";bmv[2]="SCHALKE";bmv[3]="STUTGART";bmv[4]="MANCHESTER CITY";bmv[5]="HAMBURG";bmv[6]="SC PADERBORN 07";bmv[7]="COLOGNE";
        bmv[8]="CSKA MOSCOW";bmv[9]="HANNOVER 96";bmv[10]="WERDER BREMEN";bmv[11]="ROMA";bmv[12]="BORUSSIA MONHENGLADBACH";bmv[13]="BORUSSIA DORTMUND";bmv[14]="ROMA";
        bmv[15]="ELNTRACKT FRANKFURT";bmv[16]="HOFFENHELM";bmv[17]="MANCHESTER CITY";bmv[18]="HERTHA BERLIN";bmv[19]="BAYER LEVERKUSEN";bmv[20]="CSKA MOSCOW";
        bmv[21]="FC AUGSBURG";bmv[22]="SC FRELBERG";bmv[23]="MAINZ";bmv[24]="WOLFBURG";bmv[25]="SCHALKE";bmv[26]="STUTTGART";bmv[27]="HAMBUG";bmv[28]="SHKHTAR DONETSK";
        bmv[29]="SC PADERBORN 07";bmv[30]="COLGNE";bmv[31]="ELNRACHT BRAUNSCHWEIG";bmv[32]="HANNOVER 96";bmv[33]="SHAKTAR DONETSK";bmv[34]="WERDER BREMEN ";
        bmv[35]="BORUSSIA MONCHENGLADBACH";bmv[36]="BORUSSIA DORTMUND";bmv[37]="BAYER LEVERKUSEN";bmv[38]="ELNTRACHT FRANKFURT";bmv[39]="FC PORTO";bmv[40]="HOFFENHELM";
        bmv[41]="FC PORTO";bmv[42]="HERTHA BERLI";bmv[43]="BORUSSIA DORTMUND";bmv[44]="BAYER LEVERKUSEN";bmv[45]="BARCELONA";bmv[46]="FC AYGSBURG";bmv[47]="BARCELONA";
        bmv[48]="SC FRELBURG";bmv[49]="MAINZ";
        bmr[0]=1;bmr[1]=1;bmr[2]=0;bmr[3]=1;bmr[4]=1;bmr[5]=0;bmr[6]=1;bmr[7]=1;bmr[8]=1;bmr[9]=1;bmr[10]=1;bmr[11]=0;bmr[12]=1;bmr[13]=1;bmr[14]=1;bmr[15]=1;
        bmr[16]=-1;bmr[17]=1;bmr[18]=1;bmr[19]=1;bmr[20]=1;bmr[21]=1;bmr[22]=1;bmr[23]=-1;bmr[24]=0;bmr[25]=1;bmr[26]=1;bmr[27]=0;bmr[28]=1;bmr[29]=1;bmr[30]=1;
        bmr[31]=1;bmr[32]=1;bmr[33]=1;bmr[34]=-1;bmr[35]=1;bmr[36]=0;bmr[37]=1;bmr[38]=-1;bmr[39]=1;bmr[40]=1;bmr[41]=1;bmr[42]=1;bmr[43]=0;bmr[44]=-1;bmr[45]=-1;
        bmr[46]=-1;bmr[47]=1;bmr[48]=-1;bmr[49]=1;
        
        
        
        
        cv[0]="WYCOMBE WANDERERS";cv[1]="RZ PELLETS WAC";cv[2]="WITESSE AMHEM";cv[3]="WERDER BREMEN";cv[4]="REAL SOCIEDAD";cv[5]="BURNLEY";cv[6]="LEICESTER CITY";
        cv[7]="EVERTON";cv[8]="SWANSEA CITY";cv[9]="SCHALKE";cv[10]="MANCHESTER CITY";cv[11]="BOLTON WANDERERS";cv[12]="ASTON VILLA";cv[13]="SPORTING LISBON";
        cv[14]="ARSENAL";cv[15]="CRYSTAL PALACE";cv[16]="MARLBOR";cv[17]="MANCHESTER UNITED";cv[18]="SHREWSBURY TOWN";cv[19]="QUEENS PARK RANGERS";cv[20]="MARLBOR";
        cv[21]="LIVERPOOL";cv[22]="WEST BROMWICH ALBION";cv[23]="SCHALKE";cv[24]="SUNDERLAND";cv[25]="TOTTENHAM HOTSPUR";cv[26]="NEWCASTLE UNITED";
        cv[27]="SPORTING LISBBON";cv[28]="HULL CITY";cv[29]="DERBY COUNTY";cv[30]="STOKE CITY";cv[31]="WEST HAM UNITED";cv[32]="SOUTHAMPTON";
        cv[33]="TOTTENHAM HOTSPUT";cv[34]="WATFORD";cv[35]="NEWCASTLE UNITED";cv[36]="SWANSEA CITY";cv[37]="LIVERPOOL";cv[38]="BADFORD CITY";cv[39]="LIVERPOOL";
        cv[40]="MANCHESTERCITY";cv[41]="ASTON VILLA";cv[42]="EVERTON";cv[43]="PARIS ST.GERMAN";cv[44]="BURNLEY";cv[45]="TOTTENHAM HOTSPUR";cv[46]="WEST HAM UNITED";
        cv[47]="PARIS ST.GERMAN";cv[48]="SOUTHAMPTON";cv[49]="HULL CITY";cv[50]="STOKE CITY";cv[51]="QUEENS PARK RANGERS";cv[52]="MANCHESTER UNITED";cv[53]="ARSENAL";
        cv[54]="LEICESTER CITY";cv[55]="CRYSTAL PALACE";cv[56]="LIVERPOOL";cv[57]="WEST BROMWICH ALBION";cv[58]="SUNDERLAND";cv[59]="THAILAND ALL-STARS";
        cv[60]="SYDNEY FC";
        cr[0]=1;cr[1]=0;cr[2]=1;cr[3]=-1;cr[4]=1;cr[5]=1;cr[6]=1;cr[7]=1;cr[8]=1;cr[9]=0;cr[10]=0;cr[11]=1;cr[12]=1;cr[13]=1;cr[14]=1;cr[15]=1;cr[16]=1;cr[17]=0;
        cr[18]=1;cr[19]=1;cr[20]=0;cr[21]=1;cr[22]=1;cr[23]=1;cr[24]=0;cr[25]=1;cr[26]=1;cr[27]=1;cr[28]=1;cr[29]=1;cr[30]=1;cr[31]=1;cr[32]=0;cr[33]=-1;cr[34]=1;
        cr[35]=1;cr[36]=1;cr[37]=0;cr[38]=-1;cr[39]=1;cr[40]=0;cr[41]=1;cr[42]=1;cr[43]=0;cr[44]=0;cr[45]=1;cr[46]=1;cr[47]=0;cr[48]=0;cr[49]=1;cr[50]=1;cr[51]=1;
        cr[52]=1;cr[53]=0;cr[54]=1;cr[55]=1;cr[56]=0;cr[57]=-1;cr[58]=1;cr[59]=1;cr[60]=1;
        
        
        

        lv[0]="BRONDBY";lv[1]="PRESTON NORTH END";lv[2]="ROMA";lv[3]="OLYMPLAKOS FC";lv[4]="MACHESTER CITY";lv[5]="AC MILAN";lv[6]="MANCHESTER UNITED";
        lv[7]="BORUSSIA DORTMUND";lv[8]="SOUTHAMPTON";lv[9]="MANCHESTER CITY";lv[10]="TOTTENHAM HOTSPUR";lv[11]="ASTON VILLA";lv[12]="LUDOGORETS";
        lv[13]="WEST HAM UNITED";lv[14]="MIDDLESBROUGH";lv[15]="EVERTON";lv[16]="BASEL";lv[17]="WEST BROMWICH ALBION";lv[18]="QUEENS PARK RANGERS";
        lv[19]="REAL MADRID";lv[20]="HULL CITY";lv[21]="SWANSEA CITY";lv[22]="NEWCASTLE UNITED";lv[23]="REAL MADRID";lv[24]="CHEALSEA";lv[25]="RYSTAL PALACE";
        lv[26]="LUDOGORETS";lv[27]="STOKE CITY";lv[28]="LEICESTER CITY";lv[29]="SUNDERLAND";lv[30]="BASEL";lv[31]="MANCHESTER UNITED";lv[32]="BOUREMOUTH";
        lv[33]="ARSENAL";lv[34]="BURNLEY";lv[35]="SWANSEA CITY";lv[36]="LEICESTER CITY";lv[37]="AFC WIMBELDON";lv[38]="SUNDERLAND";lv[39]="ASTON VILLA";
        lv[40]="CHEALSEA";lv[41]="BOLTON WANDERERS";lv[42]="CHEALSEA";lv[43]="WESTHAM UNITED";lv[44]="BOLTON WANDERERS";lv[45]="EVERTON";lv[46]="TOTTENHAM HOTSPUR";
        lv[47]="CRYSTAL PALACE";lv[48]="BESLKTAS";lv[49]="SOUTHAMPTON";lv[50]="BESLKTAS";lv[51]="MACHESTER CITY";lv[52]="BURNLEY";lv[53]="BLACKBURN OVERS";
        lv[54]="SWANSEA CITY";lv[55]="MANCHESTER UNITED";lv[56]="ARSENAL";lv[57]="BLACKBURN ROVERS";lv[58]="NEWCASTLE UNITED";lv[59]="ASTON VILLA";
        lv[60]="WEST BROMWICH ALIBION";lv[61]="HULL CITY";lv[62]="QUEENS PARK RANGERS";lv[63]="CHEALSEA";lv[64]="CRYSTAL PALACE";lv[65]="STOKE CITY";
        lr[0]=-1;lr[1]=1;lr[2]=-1;lr[3]=1;lr[4]=0;lr[5]=1;lr[6]=-1;lr[7]=1;lr[8]=1;lr[9]=-1;lr[10]=1;lr[11]=-1;lr[12]=1;lr[13]=-1;lr[14]=1;lr[15]=0;lr[16]=-1;
        lr[17]=1;lr[18]=1;lr[19]=-1;lr[20]=0;lr[21]=1;lr[22]=-1;lr[23]=-1;lr[24]=-1;lr[25]=-1;lr[26]=0;lr[27]=1;lr[28]=1;lr[29]=0;lr[30]=0;lr[31]=-1;lr[32]=1;
        lr[33]=0;lr[34]=1;lr[35]=1;lr[36]=0;lr[37]=1;lr[38]=1;lr[39]=1; lr[40]=0;lr[41]=0;lr[42]=-1;lr[43]=1;lr[44]=1;lr[45]=0;lr[46]=1;lr[47]=1;lr[48]=1;lr[49]=1;
        lr[50]=-1;lr[51]=1;lr[52]=1;lr[53]=0;lr[54]=1;lr[55]=-1;lr[56]=-1;lr[57]=1;lr[58]=1;lr[59]=-1;lr[60]=0;lr[61]=-1;lr[62]=1;lr[63]=0;lr[64]=-1;lr[65]=-1;
        
        
        
        
        mcv[0]="DUNDEE";mcv[1]="HEARTS";mcv[2]="SPORTING KANSAS CITY";mcv[3]="AC MILAN";mcv[4]="LIVERPOOL";mcv[5]="OLYMPLAKOS FC";mcv[6]="ARSENAL";
        mcv[7]="NEWCASTLE UNITED";mcv[8]="LIVERPOOL";mcv[9]="STOKE CITY";mcv[10]="ARSENAL";mcv[11]="BAYERN MUNICH";mcv[12]="CHELSEA";mcv[13]="SHEFFIELD WEDNESDAY";
        mcv[14]="HULL CITY";mcv[15]="ROMA";mcv[16]="ASTON VILLA";mcv[17]="TOTTENHAM HOTSPUR";mcv[18]="CSKA MOSCOW";mcv[19]="WEST HAM UNITED";mcv[20]="NEWCASTLE UNITED";
        mcv[21]="MANCHESTER UNITED";mcv[22]="CSKA MOSCOW";mcv[23]="QUEENS PARK RANGER";mcv[24]="SWANSEA CITY";mcv[25]="BAYERN MUNICH";mcv[26]="SOUTHAMPTON";
        mcv[27]="SUNDERLAND";mcv[28]="EVERTON";mcv[29]="ROMA";mcv[30]="LEICESTER CITY";mcv[31]="CRYSTAL PALACE";mcv[32]="WEST BROMWICH ALBION";mcv[33]="BURNLEY";
        mcv[34]="SUNDERLAND";mcv[35]="SHEFFIELD WEDNESDAY";mcv[36]="EEVERTON";mcv[37]="ARSENAL";mcv[38]="MIDDLEBROUGH";mcv[39]="CHELSEA";mcv[40]="HULL CITY ";
        mcv[41]="STOKE CITY";mcv[42]="NEWCASTLE UNITED";mcv[43]="BARCELONA";mcv[44]="LIVERPOOL";mcv[45]="LEICESTER CITY";mcv[46]="BURNLEY";mcv[47]="BARCELONA";
        mcv[48]="WESTBROM ALBION";mcv[49]="CRYSTAL PALACE";mcv[50]="MACHESTER UNITED";mcv[51]="WEST HAM UNITED";mcv[52]="ASTON VILLA";mcv[53]="TOTTENHAM HOTSPUR";
        mcv[54]="QUEENS PARK RANGERS";mcv[55]="SWANSEA CITY";mcv[56]="SOTHAMPTON";
        mcr[0]=-1;mcr[1]=1;mcr[2]=1;mcr[3]=1;mcr[4]=0;mcr[5]=0;mcr[6]=-1;mcr[7]=1;mcr[8]=1;mcr[9]=-1;mcr[10]=0;mcr[11]=-1;mcr[12]=0;mcr[13]=1;mcr[14]=1;mcr[15]=0;
        mcr[16]=1;mcr[17]=1;mcr[18]=0;mcr[19]=-1;mcr[20]=-1;mcr[21]=1;mcr[22]=-1;mcr[23]=0;mcr[24]=1;mcr[25]=1;mcr[26]=1;mcr[27]=1;mcr[28]=1;mcr[29]=1;mcr[30]=1;
        mcr[31]=1;mcr[32]=1;mcr[33]=0;mcr[34]=1;mcr[35]=1;mcr[36]=0;mcr[37]=-1;mcr[38]=-1;mcr[39]=0;mcr[40]=0;mcr[41]=1;mcr[42]=1;mcr[43]=-1;mcr[44]=-1;mcr[45]=1;
        mcr[46]=-1;mcr[47]=-1;mcr[48]=1;mcr[49]=-1;mcr[50]=-1; mcr[51]=1;mcr[52]=1;mcr[53]=1;mcr[54]=1;mcr[55]=1;mcr[56]=1;
        
        
        
                       
        muv[0]="LOS ANGELES GALXY";muv[1]="ROMA";muv[2]="INTER MILAN";muv[3]="REAL MADRID";muv[4]="LIVERPOOL";muv[5]="VALENCIA";muv[6]="SWANSEA CITY";
        muv[7]="SUNDERLAND";muv[8]="MILTON KEYNES DONS";muv[9]="BURNLEY";muv[10]="QUEENS PARK RANGERS";muv[11]="LEICESTER CITY";muv[12]="WEST HAM UNITED";
        muv[13]="EVERTON";muv[14]="WEST BROMWICH ALBION";muv[15]="CHELSEA";muv[16]="MANCHESTER CITY";muv[17]="CRYSTAL PALACE";muv[18]="ARSENAL";muv[19]="HULL CITY";
        muv[20]="STOKE CITY";muv[21]="SOUTHAMPTON";muv[22]="LIVERPOOL";muv[23]="ASTON VILLA";muv[24]="NEWCASTLE UNITED";muv[25]="TOTTENHAM HOTSPUR";
        muv[26]="STOKE CITY";muv[27]="YEOVIL TOWN";muv[28]="SOTHAMPTON";muv[29]="QUEENS PARK RANGERS";muv[30]="CAMBRIDGE UNITED";muv[31]="LEICESTER CITY";
        muv[32]="CAMBRIDGE UNITED";muv[33]="WESTHAM UNITED";muv[34]="BURNLEY";muv[35]="PRESTON NORTH END";muv[36]="SWANSEA CITY";muv[37]="SUNDERLAND";
        muv[38]="NEWCASTLE UNITED";muv[39]="ARSENAL";muv[40]="TOTTENHAM HOTSPUR";muv[41]="LIVERPOOL";muv[42]="ASTON VILLA";muv[43]="MANCHESTER CITY";
        muv[44]="CHEALSEA";muv[45]="EVERTON";muv[46]="WEST BROMWICH ALBION";muv[47]="CRYSTAL PALACE";muv[48]="ARSENAL";muv[49]="HULL CITY";        
        mur[0]=1;mur[1]=1;mur[2]=0;mur[3]=1;mur[4]=1;mur[5]=1;mur[6]=-1;mur[7]=0;mur[8]=-1;mur[9]=0;mur[10]=1;mur[11]=-1;mur[12]=1;mur[13]=1;mur[14]=0;mur[15]=0;
        mur[16]=-1;mur[17]=1;mur[18]=1;mur[19]=1;mur[20]=1;mur[21]=1;mur[22]=1;mur[23]=0;mur[24]=1;mur[25]=0;mur[26]=0;mur[27]=1;mur[28]=-1;mur[29]=1;mur[30]=0;
        mur[31]=1;mur[32]=1;mur[33]=0;mur[34]=1;mur[35]=1;mur[36]=-1;mur[37]=1;mur[38]=1;mur[39]=-1;mur[40]=1;mur[41]=1;mur[42]=1;mur[43]=1;mur[44]=-1;mur[45]=-1;
        mur[46]=-1;mur[47]=1;mur[48]=0;mur[49]=0;
        
        
        
        
        pv[0]="REIMS";pv[1]="BASTLA";pv[2]="EVLAN THONON GALILLAR";pv[3]="ST ETLENNE";pv[4]="RENNES";pv[5]="AJAX";pv[6]="LYON";pv[7]="CAEN";pv[8]="TOULOUSE";
        pv[9]="BARCELONA";pv[10]="MONACO";pv[11]="RC LENS";pv[12]="APOEL NICOSLA";pv[13]="BORDEAUX";pv[14]="LORIENT";pv[15]="APOEL NICOSLA";pv[16]="MARSELLE";
        pv[17]="METZ";pv[18]="AJAX";pv[19]="NICE";pv[20]="LILLE";pv[21]="NANTES";pv[22]="BARCELONA";pv[23]="GULNGAMP";pv[24]="MONTPELLER";pv[25]="BASTLA";
        pv[26]="EVLAN THONON GALILLAR";pv[27]="ST ETLENNE";pv[28]="RENNES";pv[29]="LYON";pv[30]="CAEN";pv[31]="CHELSEA";pv[32]="TOULOUSE";pv[33]="MONACO";
        pv[34]="RC LENS";pv[35]="CHELSEA";pv[36]="BORDEAUX";pv[37]="LORIENT";pv[38]="MARSELLE";pv[39]="ST ETLENNE";pv[40]="BARCELONA";pv[41]="NICE";
        pv[42]="BARCELONA";pv[43]="LILLE";pv[44]="MERTZ";pv[45]="NANTES";pv[46]="GUINGAMP";pv[47]="MONTPELLER";pv[48]="REIMS";pv[49]="AUXERRE";
        pr[0]=0;pr[1]=1;pr[2]=0;pr[3]=1;pr[4]=0;pr[5]=0;pr[6]=0;pr[7]=1;pr[8]=0;pr[9]=1;pr[10]=0;pr[11]=1;pr[12]=1;pr[13]=1;pr[14]=1;pr[15]=1;pr[16]=1;pr[17]=1;
        pr[18]=1;pr[19]=1;pr[20]=0;pr[21]=1;pr[22]=-1;pr[23]=-1;pr[24]=0;pr[25]=-1;pr[26]=1;pr[27]=1;pr[28]=1;pr[29]=0;pr[30]=0;pr[31]=0;pr[32]=1;pr[33]=0;pr[34]=1;
        pr[35]=0;pr[36]=-1;pr[37]=1;pr[38]=1;pr[39]=1;pr[40]=-1;pr[41]=1;pr[42]=-1;pr[43]=1;pr[44]=1;pr[45]=1;pr[46]=1;pr[47]=1;pr[48]=1;pr[49]=1;
        
        
        
        
        rv[0]="INTER MILAN";rv[1]="ROMA";rv[2]="MANCHETER UNITD";rv[3]="SEVILLA";rv[4]="ATHELETICO MADRID";rv[5]="ATHELETICO MADRID";rv[6]="CORDOBA";
        rv[7]="REAL SOCIEDAD";rv[8]="ATHELETICO MADRID";rv[9]="BASEL";rv[10]="DEPORTLVO LA CORUNA";rv[11]="ELCHE";rv[12]="VILLARREAL";rv[13]="LUDOGORETS";
        rv[14]="ATHELETIC BILBAO";rv[15]="LEVANTE";rv[16]="LIVERPOOL";rv[17]="BARCELONA";rv[18]="UD CORNELLA";rv[19]="GRANADA";rv[20]="LIVERPOOL";
        rv[21]="RAYO VALLECANO";rv[22]="EIBAR";rv[23]="BASEL";rv[24]="MALAGA";rv[25]="UD CORNELLA";rv[26]="CELTA VIGO";rv[27]="LUDOGORETS";rv[28]="ALMERIA";
        rv[29]="CRUZ AZUL";rv[30]="SAN LORENZO";rv[31]="VALENCIA";rv[32]="ATHELETICO MADRID";rv[33]="ESPANYOL";rv[34]="ATHELETICO MADRID";rv[35]="GETAFE";
        rv[36]="CORDOBA";rv[37]="REAL SOCIEDAD";rv[38]="SEVILLA";rv[39]="ATHELETICO MADRID";rv[40]="DEPORTLVO LA CORUNA";rv[41]="SCHALKE";rv[42]="ELCHE";
        rv[43]="VILLARREAL";rv[44]="ATHELETIC BILBAO";rv[45]="SCHALKE";rv[46]="LEVANTE";rv[47]="BARCELONA";rv[48]="GRANADA";rv[49]="RAYO VALLECANO";
        rv[50]="EIBAR";rv[51]="ATHELETICO MADRID";rv[52]="MALAGA";rv[53]="ATHELETICO MADRID";rv[54]="CELTO VIGO";rv[55]="ALMERIA";rv[56]="SEVILLA";
        rv[57]="JUVENTUS";rv[58]="VALENCIA";rv[59]="JUVENTUS";rv[60]="ESPANYOL";rv[61]="GETAFE";
        rr[0]=0;rr[1]=-1;rr[2]=-1;rr[3]=1;rr[4]=0;rr[5]=-1;rr[6]=1;rr[7]=-1;rr[8]=-1;rr[9]=1;rr[10]=1;rr[11]=1;rr[12]=1;rr[13]=1;rr[14]=1;rr[15]=1;rr[16]=1;rr[17]=1;
        rr[18]=1;rr[19]=1;rr[20]=1;rr[21]=1;rr[22]=1;rr[23]=1;rr[24]=1;rr[25]=1;rr[26]=1;rr[27]=1;rr[28]=1;rr[29]=1;rr[30]=1;rr[31]=1;rr[32]=-1;rr[33]=-1;rr[34]=1;
        rr[35]=0;rr[36]=1;rr[37]=1;rr[38]=1;rr[39]=-1;rr[40]=1;rr[41]=1;rr[42]=1;rr[43]=0;rr[44]=-1;rr[45]=-1;rr[46]=1;rr[47]=-1;rr[48]=1;rr[49]=1;rr[50]=1;rr[51]=0;
        rr[52]=1;rr[53]=1;rr[54]=1;rr[55]=1;rr[56]=1;rr[57]=-1;rr[58]=0;rr[59]=0;rr[60]=1;rr[61]=1;
        
        
        

        wv[0]="CARDIFF CITY";wv[1]="BAYERN MUNICH";wv[2]="ELNTRACHT FRANKFURT";wv[3]="HOFFENHELM";wv[4]="EVERTON";wv[5]="BAYER LEVERKUSEN";wv[6]="HERTHA BERLIN";
        wv[7]="WERDER BERMEN";wv[8]="LILLE";wv[9]="FC AUGSBURG";wv[10]="SC FRELBURG";wv[11]="KRASNODAR";wv[12]="MAINZ";wv[13]="STUTTGART";wv[14]="KRASNODAR";
        wv[15]="HAMBURG";wv[16]="SCHALKE";wv[17]="EVERTON";wv[18]="BORUSSIA MONCHEGLADBACH";wv[19]="HANNOVER 96";wv[20]="LILLE";wv[21]="SC PADERBORN 07";
        wv[22]="BORUSSIA DOTMUND";wv[23]="COLOGNE";wv[24]="BAYERN MUNICH";wv[25]="ELNTRACHT FRANKFURT";wv[26]="HOFFENHELM";wv[27]="BAYER LEVERKUSEN";
        wv[28]="SPORTING LISBON";wv[29]="HERTHA BERLIN";wv[30]="SPORTING LISBON";wv[31]="WERDER BERLIN";wv[32]="RB LELPZIG";wv[33]="FC AUGSBERG";wv[34]="INTER MILAN";
        wv[35]="SC FRELBURG";wv[36]="INTER MILAN";wv[37]="MAINZ";wv[38]="STUTTGART";wv[39]="SC FRELBURG";wv[40]="HAMBURG";wv[41]="NAPOLI";wv[42]="SCHALKE";
        wv[43]="NAPOLI";wv[44]="BORUSSIA MONCHENGLADBACH";wv[45]="ARMINIA BIELFELD";wv[46]="HANNOVER 96";wv[47]="SC PADERSON 07";wv[48]="BORUSSIA DORTMUND";
        wv[49]="COLOGNE";
        wr[0]=0;wr[1]=1;wr[2]=0;wr[3]=0;wr[4]=-1;wr[5]=1;wr[6]=-1;wr[7]=1;wr[8]=0;wr[9]=1;wr[10]=1;wr[11]=1;wr[12]=1;wr[13]=1;wr[14]=1;wr[15]=1;wr[16]=-1;wr[17]=-1;
        wr[18]=1;wr[19]=1;wr[20]=1;wr[21]=0;wr[22]=0;wr[23]=1;wr[24]=1;wr[25]=0;wr[26]=1;wr[27]=1;wr[28]=1;wr[29]=1;wr[30]=0;wr[31]=1;wr[32]=1;wr[33]=-1;wr[34]=1;
        wr[35]=1;wr[36]=1;wr[37]=0;wr[38]=1;wr[39]=1;wr[40]=1;wr[41]=-1;wr[42]=0;wr[43]=0;wr[44]=-1;wr[45]=1;wr[46]=0;wr[47]=1;wr[48]=1;wr[49]=0;

        System.out.println("WELCOME TO ALL RANDOM PREDICTIONS");
        System.out.println("YOU HAVE: "+acc+" COINS TO PLAY WITH");

        while(true)
        {
            int gen=(int)Math.floor(Math.random() * 9) + 1;
            int mn=(int)Math.floor(Math.random() * allran[gen].length-1) + 1;
            System.out.println(allranname[gen]+" V/S "+allran[gen][mn]);
            System.out.println("TO BET FOR"+ allranname[gen]+" PRESS 1, TO BET AGAINST PRESS -1,FOR DRAW PRESS 0"); 
            int c=sc.nextInt();
            System.out.println(allranname[gen]+" V/S "+allran[gen][mn]);
            if(allranr[gen][mn]==1)
                System.out.println(allranname[gen] +" wins");
            else if(allranr[gen][mn]==-1)
                System.out.println(allranname[gen]+" looses");
            else
                System.out.println("DRAW");
            if(c==allranr[gen][mn]){
                System.out.println("you Win");
                acc+=50;
                cntr++;
                System.out.println("YOU HAVE "+acc);
            }
            else
            {
                System.out.println("you loose");
                acc-=50;
                System.out.println("YOU HAVE"+acc);

            }
            System.out.println("DO YOU WANT To PLAY AGAIN IF YES PRESS 'y' ELSE PRESS 'n'");
            String s=sc.next();
            char  ch=s.charAt(0);
            if(ch=='y' || ch=='Y'){
                System.out.println("YOU HAVE "+acc);
                System.out.println("\f");
                continue;
            }
            else if(ch=='n' || ch=='N')
            {
                System.out.println("\f");
                System.out.println("-----------------------------THANK YOU FOR PLAYING--------------------------------");
                System.out.println("CONGRTULATIONS YOU HAVE WON     "+acc);
                System.out.println("NO OF RIGHT RIGHT PREDICTIONS WERE:- "+cntr);
                tc=0;
                acc=0;
                cntr=0;
                System.exit(0);
                break;
            }
        }
    }

    public static void main(String args[])//MAIN METHOD
    {
        ISC_COMPUTER_SCIENCE_PROJECT ob=new ISC_COMPUTER_SCIENCE_PROJECT();
        ob.gamemode();
    }
}

