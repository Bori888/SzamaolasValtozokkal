package main;

public class Program {

    public static void main(String[] args) {

        System.out.println("### String és ###\n");

        //Stringek és változok
        System.out.println("\nStringek és változok:");
        String nyelv = "Java";
        String szeretem = "Szeretem";
        System.out.println(szeretem + " a " + nyelv + " nyelvet!");
        System.out.println("### Számok és + ###");

        //Összeadás és kivonás
        System.out.println("\nÖsszeadás kivonás:");
        System.out.println(7 + 3);
        System.out.println(7 + 3 + "= 7+3");
        System.out.println("7+3 = " + (7 + 3));//string ként kezdte el és ugy is folytata zárolyel nélkül
        System.out.println("7-3 = " + (7 - 3));

        //szorzás osztás
        System.out.println("\nSzorzás osztás:");
        System.out.println("7*3= " + 7 * 3);//magasbb rendu a szorszás és az sztás nem kel zárolyel
        System.out.println("7/3= " + 7 / 3);

        //osztásoko típusai
        System.out.println("\nOsztások tipusai:");
        System.out.println("7/3= " + 7 / 3);//egészrész 
        System.out.println("7/3= " + 7.0 / 3);//valos rész 
        System.out.println("7/3= " + 7 / 3);

        //változokkal muveletk
        System.out.println("\nVátozokkal alapmüveletek:");
        //változok
        int egesz1 = 7;//egesz
        int egesz2 = 3;
        double valos1 = 7.0;//valos
        String plusz = "+";
        String minusz = "-";
        String csillag = "*";
        String per = "/";
        String egyenlo = "=";

        //muveletek kiirása
        System.out.println("muveletek kiirása:");
        System.out.println(egesz1 + per + egesz2 + egyenlo + egesz1 / egesz2);
        System.out.println(valos1 + per + egesz2 + egyenlo + valos1 / egesz2);
        System.out.println(egesz1 + csillag + egesz2 + egyenlo + egesz1 * egesz2);
        System.out.println(egesz1 + plusz + egesz2 + egyenlo + (egesz1 + egesz2));
        System.out.println(egesz1 + minusz + egesz2 + egyenlo + (egesz1 - egesz2));
        //minden egyformátnevez át Jobb klik refaktorizálás vagy cntr R
        //muveletek elöre változokban

        int osszeadas_eredmeny = (egesz1 + egesz2);
        int kivonas_eredmeny = (egesz1 - egesz2);
        int szorzas_eredmeny = (egesz1 * egesz2);
        double osztas_valos_eredmeny = (valos1 / egesz2);
        //egész /egyész egészt ad visz és ha valosba rakom akkor nem lesz jo az eredmény 7.0/3=2.0
        int osztas_egesz_eredmeny = (egesz1 / egesz2);

        //muveletek kirása minden változoban
        System.out.println("muveletek kirása minden változoban:");
        System.out.println(egesz1 + per + egesz2 + egyenlo + osztas_egesz_eredmeny);
        System.out.println(valos1 + per + egesz2 + egyenlo + osztas_valos_eredmeny);
        System.out.println(egesz1 + csillag + egesz2 + egyenlo + szorzas_eredmeny);
        System.out.println(egesz1 + plusz + egesz2 + egyenlo + osszeadas_eredmeny);
        System.out.println(egesz1 + minusz + egesz2 + egyenlo + kivonas_eredmeny);

        //muveletek ki rása 2 változoval
        System.out.println("muveletek ki rása 2 változoval:");
        //muveletek változok
        String osszeadas_muvelet = egesz1 + plusz + egesz2 + egyenlo;
        String kivonas_muvelet = egesz1 + minusz + egesz2 + egyenlo;
        String szorzas_muvelet = egesz1 + csillag + egesz2 + egyenlo;
        String osztas_muvelet = valos1 + per + egesz2 + egyenlo;

        System.out.println(osszeadas_muvelet + osszeadas_eredmeny);
        System.out.println(osztas_muvelet + osztas_egesz_eredmeny);
        System.out.println(osztas_muvelet + osztas_valos_eredmeny);
        System.out.println(szorzas_muvelet + szorzas_eredmeny);
        System.out.println(kivonas_muvelet + kivonas_eredmeny);
        
        
        //Logikai válotozok
        System.out.println("\nLogikai változok:");
        boolean logikaiValtozo = true;//soutv tab belegenerálja az elso változot
        boolean sutANap = true;
        
        
        System.out.println("sutANap = " + sutANap);
        System.out.println("logikaiValtozo = " + logikaiValtozo);
        
        //elágazás
        System.out.println("Elágazás if:");
        String idojaras ="ez igaz";
        
        if (sutANap == true) {
            
            System.out.println("Süt a nap: " + idojaras);
            
        } else {
            idojaras= "ez hamis";
            System.out.println("Süt a nap: " + idojaras);
        }
        
        
        

    }

}
