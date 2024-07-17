import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Banco {

    private String nome;
    private List<Conta> contas;
    private String moedaOficial = "$ Dólar Americano $";

    void setNome(String banco_XYZ) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}