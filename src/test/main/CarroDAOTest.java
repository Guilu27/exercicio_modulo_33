package main;

import dao.*;
import domain.Carro;
import domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CarroDAOTest {
    private IMarcaDAO iMarcaDAO;
    private ICarroDAO iCarroDAO;

    public CarroDAOTest(){
        iMarcaDAO = new MarcaDAO();
        iCarroDAO = new CarroDAO();
    }

    @Test
    public void cadastro(){
        Marca marca = criarMarca();
        Carro carro = criarCarro(marca);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }

    private Carro criarCarro(Marca marca) {
        Carro carro = new Carro();
        carro.setCodigo("A2");
        carro.setNome("Carro 2");
        carro.setMarca(marca);

        return iCarroDAO.cadastrar(carro);
    }

    private Marca criarMarca() {
        Marca marca = new Marca();
        marca.setCodigo("A2");
        marca.setNome("Marca 2");

        return iMarcaDAO.cadastrar(marca);
    }
}
