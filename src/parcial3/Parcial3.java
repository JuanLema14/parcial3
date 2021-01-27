package parcial3;

public class Parcial3 {

    /*public String recorridoMaterial (int[][] matrizA, int cantidadInicial, int [] necEs){
	String res="inicio en id "+0;
        for(int i=0;i<matrizA.length;i++){
            if(cantidadInicial!=0){ 
                for(int j=0;j<matrizA.length;j++){
                    if(matrizA[i][j]==1){
                        int aux=0,mayor=0;                      
                        while(matrizA[i][j]<matrizA.length){
                            aux=necEs[j];
                            if(aux>mayor){
                                mayor=aux;
                                j++;
                            }else{
                                if(cantidadInicial>mayor){
                                    cantidadInicial=cantidadInicial-mayor;
                                    necEs[j]=0;
                                    res=res+", luego id "+j;
                                }else{
                                    mayor=mayor-cantidadInicial;
                                    cantidadInicial=0;
                                    necEs[j]=mayor;
                                    res=res+", por ultimo id "+j;
                                }
                            }
                        }
                        
                    }else if(matrizA[i][j]==matrizA.length && cantidadInicial>0){
                        i=0;
                        j=0;
                    }
                    
                }
            }
        }
        return res;
    }*/
    public String recorridoMaterial(int[][] matrizA, int cantInicial, int[] necEst) {
        String res = "inicio en id " + 0;
        int mayorP = 0;
        int mayorN = necEst[0];
        for (int i = 0; i < matrizA.length; i++) {
            int aux=0;
            for (int j = 0; j < matrizA.length; j++) {
                if (matrizA[i][j] == 1) {
                    if (necEst[j] > mayorN) {
                        if (cantInicial > necEst[j]) {
                            mayorN = necEst[j];
                            mayorP = j;
                            aux=j;
                        }
                    }
                }

            }
            if (mayorP != 0) {
                cantInicial = cantInicial - necEst[aux];
                necEst[aux] = 0;
                res += ", Luego en id " + aux;
                mayorP=0;
                mayorN=0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrizA = {{0, 1, 0, 1}, {1, 0, 0, 1}, {0, 0, 0, 1}, {1, 1, 1, 0}};
        int[] necesidadE = {0, 40, 10, 30};
        Parcial3 obj = new Parcial3();
        System.out.println(obj.recorridoMaterial(matrizA, 800, necesidadE));

    }

}
