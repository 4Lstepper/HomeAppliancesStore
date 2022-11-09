public class Main {

    static String companyname;
    static String companyaddress;
    static int companysize;

    static int getCompanysize(){
        return companysize;
    }
    static String getCompanyname(){
        return companyname;
    }
    static String getCompanyaddress(){
        return companyaddress;
    }
    static void setCompanyname(String a){
        companyname=a;
    }
    static void setCompanyaddress(String b){
        companyaddress=b;
    }
    static void setCompanysize(int c){
        companysize=c;

    }

    public static void main(String[] args) {
        setCompanyname(args[0]);
        setCompanyaddress(args[1]);
        setCompanysize(Integer.parseInt(args[2]));
        if(companyname == null ) {
            System.out.println("null string,try again");
        }
        if(companyaddress == null ) {
            System.out.println("null string,try again");}



        System.out.println(companyname+companyaddress+companysize);


    }
}