import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class Employ�s
{
    String Nom,Pr�nom;
    protected Date date_arriv�e;;
    protected Date date_naissance;
    Date Today;
    String s,s1="";
    protected double Prime;
    protected double Salaire;
   
    public Employ�s()
    {
       
        System.out.println("\nVeuillez entrer le Nom :");
 
        Scanner a= new Scanner(System.in);
        s=a.nextLine();
        Nom=s;
       
        System.out.println("\nVeuillez entrer le Pr�nom :");
 
        Scanner b= new Scanner(System.in);
        s=b.nextLine();
       
        Pr�nom=s;
        //.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"
       
        while (s.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")==false)
        {
            System.out.println("\nVeuillez entrer votre date de naissance au format : dd/mm/yyyy");
   
            Scanner x= new Scanner(System.in);
            s=x.nextLine();
   
           
        }
       
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date_naissance = sdf.parse(s);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        while (s1.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")==false)
        {
        System.out.println("\nVeuillez entrer date d'embauche au format : dd/mm/yyyy");
 
        Scanner y= new Scanner(System.in);
        s1=y.nextLine();
        }
       
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date_arriv�e = sdf1.parse(s1);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
               
        Date today = new java.util.Date();
       
        long time1 = today.getTime();
        long time2 = date_arriv�e.getTime();
        long diff =(time1-time2);
       
        diff=(diff/(1000*60*60*24))/365;
               
        double pPrime = 0;
       
        if (diff<5)
            pPrime=0.02;
        if (diff>5 && diff<10)
            pPrime=(0.05);
        if (diff>10)
            pPrime=(0.1);
       
        Prime=pPrime;
       
        }
}