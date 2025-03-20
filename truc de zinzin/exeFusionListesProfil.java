public class exeFusionListesProfil {
    public static void main(String[] args) {
        char[] l1 = new char[]{'A'};
        char[] l2 = new char[]{'B', 'D', 'F'};
        
        char[] l3 = fusion(l1, l2);
        
        System.out.print("Liste fusionnée : ");
        for (char c : l3) {
            System.out.print(c + " ");
        }
    }
    
    public static char[] fusion(char[] l1, char[] l2) {
        char[] l3 = new char[l1.length + l2.length];
        int i = 0, j = 0, k = 0;
        
        while (i < l1.length && j < l2.length) {
        if (l1[i] < l2[j]) {
        l3[k++] = l1[i++];
        } else {
        l3[k++] = l2[j++];
        }
        }
        
        while (i < l1.length) {
        l3[k++] = l1[i++];
        }
        
        while (j < l2.length) {
        l3[k++] = l2[j++];
        }
        
        return l3;
        }
       }