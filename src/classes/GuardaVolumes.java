package classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {
    private Integer cont=0;
    private Map<Integer, List<Peca>> pecasMap = new HashMap<>();

    public Integer guardarPecas(List<Peca> listaDePeca){
        this.cont += 1;
        pecasMap.put(this.cont, listaDePeca);
        return cont;
    }

    public void mostrarPecas(){
        int contador = 0;
        for(Integer chave  :pecasMap.keySet()){
            contador += 1;
            List<Peca> valor = pecasMap.get(chave);
                    System.out.println("Chave: " + cont + "| Peças: " + contador + valor);
        }
    }

    public void devolverPecas(Integer numero){
        pecasMap.remove(numero);
        System.out.println("Peças de número '" + numero + "' foram removidas do Guarda-Volumes.");
    }
}
