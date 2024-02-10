package main;

import dao.*;
import domain.Acessorio;
import domain.Carro;
import domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AcessorioDAOTest {
    private IMarcaDAO iMarcaDAO;
    private ICarroDAO iCarroDAO;
    private IAcessorioDAO iAcessorioDAO;

    public AcessorioDAOTest(){
        iMarcaDAO = new MarcaDAO();
        iCarroDAO = new CarroDAO();
        iAcessorioDAO = new AcessorioDAO();
    }

    @Test
    public void cadastro(){
        Marca marca = criarMarca();
        Carro carro = criarCarro(marca);
        Acessorio acessorio = criarAcessorio(carro);

        assertNotNull(acessorio);
        assertNotNull(acessorio.getId());
    }

    private Acessorio criarAcessorio(Carro carro) {
        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo("A3");
        acessorio.setNome("Acessorio 3");
        acessorio.setCarro(carro);

        return iAcessorioDAO.cadastrar(acessorio);
    }

    private Carro criarCarro(Marca marca) {
        Carro carro = new Carro();
        carro.setCodigo("A3");
        carro.setNome("Carro 3");
        carro.setMarca(marca);

        return iCarroDAO.cadastrar(carro);
    }

    private Marca criarMarca() {
        Marca marca = new Marca();
        marca.setCodigo("A3");
        marca.setNome("Marca 3");

        return iMarcaDAO.cadastrar(marca);
    }
}
