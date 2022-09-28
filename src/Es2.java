/*creazione di due stringhe che scrivono valori opposti variando a ogni ciclo */

class Main2 {
    public static void main(String[] args) {
        int [] stringa1 = {0,1,2,3,4,5};

        for (int i=0; i < stringa1.length; i++) {
            System.out.println("I= " + stringa1[i]);
            for (int j=0; j<=i; j++) {
                System.out.println("J= " + stringa1[j]);
            }
            for (int k=(stringa1.length)-1; k>i; k--){
            
                System.out.println("K= " + stringa1[k]);
                
            }
            
            
        }
    
    }
}
