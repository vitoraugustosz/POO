package ads.poo;

import java.text.ParseException;
import java.util.HashMap;
import javax.swing.text.MaskFormatter;

public class ColecaoEmail {
    private final String EXPRESSAO_REGULAR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private HashMap<String, String> dados = new HashMap<>();

    public boolean add(String rotulo, String valor) {
        if (dados.containsValue(valor)) { //Para não repetir o próprio EMAIL, evitar dois rótulos com mesmo número
            return false;
        }
        dados.put(rotulo, this.formata(EXPRESSAO_REGULAR, valor));
        return true;
    }

    public boolean remove(String rotulo) {
        if (dados.containsKey(rotulo)) {
            dados.remove(rotulo);
            return true;
        }
        return false;

    }

    public boolean update(String rotulo, String valor) {//qual ele quer editar, qual o novo número
        if (dados.containsKey(rotulo)) {
            dados.put(rotulo, this.formata(EXPRESSAO_REGULAR, valor));
            return true;
        }
        return false;
    }

    public String formata(String mascara, String valor) {
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }


    public String toString(String rotulo) {
        final StringBuilder sb = new StringBuilder("Contato cadastrado: \n");

        if (dados.containsKey(rotulo)) {
            dados.forEach((identificacao, tel) -> {
                if (identificacao.equalsIgnoreCase(rotulo)) {

                    sb.append(rotulo).append(": ");
                    sb.append(tel);
                    sb.append(".");

                }

            });
            return sb.toString();
        }
        return "N/a";
    }
}
