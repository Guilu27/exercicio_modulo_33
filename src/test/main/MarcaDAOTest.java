package main;

import dao.*;
import domain.Acessorio;
import domain.Carro;
import domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MarcaDAOTest {
    private IMarcaDAO iMarcaDAO;

    public MarcaDAOTest(){
        iMarcaDAO = new MarcaDAO();
    }

    @Test
    public void cadastro(){
        Marca marca = criarMarca();

        assertNotNull(marca);
        assertNotNull(marca.getId());
    }

    private Marca criarMarca() {
        Marca marca = new Marca();
        marca.setCodigo("A1");
        marca.setNome("Marca 1");

        return iMarcaDAO.cadastrar(marca);
    }
}
