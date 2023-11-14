package _2023;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Ruben Blanco
 */

public class Challenge1 {
   /**
    ** El reto **
    Un espía está enviando mensajes encriptados.

    Tu misión es crear un programa que nos ayude a buscar patrones...

    Los mensajes son palabras separadas por espacios como este:
    gato perro perro coche Gato peRRo sol

    Necesitamos que el programa nos devuelva el número de veces que aparece cada palabra en el mensaje, independientemente de si está en mayúsculas o minúsculas.

    El resultado será una cadena de texto con la palabra y el número de veces que aparece en el mensaje, con este formato:
    gato2perro3coche1sol1

    ¡Las palabras son ordenadas por su primera aparición en el mensaje!

    ** Más ejemplos: **
    llaveS casa CASA casa llaves -> llaves2casa3
    taza ta za taza -> taza2ta1za1
    casas casa casasas -> casas1casa1casasas1
    *
    */ 
    public static String ch1(String s){
        s = s.toLowerCase();
        String[] arr = s.split(" ");
        Map<String, Integer> map = arrToMap(arr);
        String res = "";
        for(Entry<String, Integer> e: map.entrySet()){
            res += e.getKey() + e.getValue();
        }
        return res;
    }
    
    private static Map<String, Integer> arrToMap(String[] arr){
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String s: arr){
            Integer c = map.get(s);
            if(c == null)
            {
                map.put(s, 1);
            }else{
                map.put(s, c+1);
            }
        }
        return map;
    }
}
