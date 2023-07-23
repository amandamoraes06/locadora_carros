package teste;

import model.Cliente;
import model.Locacao;
import model.Veiculo;
import model.Fabricante;
import service.LocadoraService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LocadoraServiceTest {
    
    @Test
    public void testBuscarClientePorLocacao() {
        // lista de locações pra testar
        List<Locacao> locacoes = new ArrayList<>();
        
        // criação dos objetos cliente, veiculo, fabricante e locacao
        Cliente cliente1 = new Cliente("Amanda", "123456789", "Rua A, 123", 99999999);
        Cliente cliente2 = new Cliente("Ben", "456789123", "Rua B, 456", 88888888);
        
        Fabricante fabricante1 = new Fabricante("Chevrolet","Estados Unidos");
        Fabricante fabricante2 = new Fabricante("Chevrolet","Estados Unidos");
        
        Veiculo veiculo1 = new Veiculo(fabricante1, "Classic", 2023, "ABC123", true);
        Veiculo veiculo2 = new Veiculo(fabricante2, "Prisma", 2023, "DEF456", true);
        
        Locacao locacao1 = new Locacao(veiculo1, cliente1, new Date(), new Date(), 100.0, 1);
        Locacao locacao2 = new Locacao(veiculo2, cliente2, new Date(), new Date(), 150.0, 2);
        
        // adiciona as locações a lista.
        locacoes.add(locacao1);
        locacoes.add(locacao2);
        
        // Criação da instancia de locadoraservice com a lista de locacoes
        LocadoraService locadoraService = new LocadoraService(locacoes);
        
        // teste do método buscarclienteporlocacao
        int numeroLocacao = 2;
        Cliente clienteEncontrado = locadoraService.buscarClientePorLocacao(numeroLocacao);
        
        // verifica se o cliente retornado é o esperado
        assertNotNull(clienteEncontrado);
        assertEquals("Amanda", clienteEncontrado.getNome());
        assertEquals("123456789", clienteEncontrado.getCpf());
        assertEquals("Rua A, 123", clienteEncontrado.getEndereco());
        assertEquals(99999999, clienteEncontrado.getTelefone());
    }
}
