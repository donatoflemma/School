package types_operators_flowcontrol;


class OpLogicalDemo {

//---------
static boolean falseMethod(String id) {
       System.out.println("false "+id);
       return false;
}
//---------
static boolean trueMethod(String id) {
       System.out.println("true "+id);
       return true;
}
//---------
  public static void main (String s[]) {

       // bitweise Verknüpfung
       // System.out.println(   (1 | 2)                     + "\n");

       // 1) logische Verkn�pfung
      //System.out.println(   ( falseMethod("1") && trueMethod("2") )    + "\n");

       // 2) logische Verkn�pfung
       System.out.println(   ( trueMethod("4") | falseMethod("3") )   + "\n" );
  }
//---------
}