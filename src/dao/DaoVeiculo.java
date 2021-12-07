package dao;

import beans.Veiculo;
import conection.Conection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoVeiculo {

    public DaoVeiculo() {
    }

    //GRAVAR
    //====================================
    public boolean grava(Veiculo veiculo) {
        try {
            PreparedStatement comandoSQL;
            comandoSQL = Conection.getInstance().prepareStatement(
                    "INSERT INTO veiculo(cod, marca, modelo, cor, placa, nomeprop, telprop, cpfprop) "
                    + "VALUES(?,?,?,?,?,?,?,?)");
            comandoSQL.setInt(1, veiculo.getCod());
            comandoSQL.setString(2, veiculo.getMarca());
            comandoSQL.setString(3, veiculo.getModelo());
            comandoSQL.setString(4, veiculo.getCor());
            comandoSQL.setString(5, veiculo.getPlaca());
            comandoSQL.setString(6, veiculo.getNomeProp());
            comandoSQL.setString(7, veiculo.getTelProp());
            comandoSQL.setString(8, veiculo.getCpfProp());
            comandoSQL.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //ALTERAR
    //====================================
    public boolean atualiza(Veiculo veiculo) {
        try {
            PreparedStatement comandoSQL;
            //OBS: A ALTERAÇÃO É FEITA COM BASE EM "COD", QUE É A CHAVE PRIMARIA QUE REFERENCIA UMA LINHA DA TABELA VEICULO
            comandoSQL = Conection.getInstance().prepareStatement(
                    "UPDATE VEICULO SET marca =  ?, modelo = ?, cor = ?, placa= ?, "
                    + "nomeprop = ?, telprop = ?, cpfprop = ?, WHERE  cod =  ? ");
            comandoSQL.setString(1, veiculo.getMarca());
            comandoSQL.setString(2, veiculo.getModelo());
            comandoSQL.setString(3, veiculo.getCor());
            comandoSQL.setString(4, veiculo.getPlaca());
            comandoSQL.setString(5, veiculo.getNomeProp());
            comandoSQL.setString(6, veiculo.getTelProp());
            comandoSQL.setString(7, veiculo.getCpfProp());
            comandoSQL.setInt(8, veiculo.getCod());
            comandoSQL.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //DELETAR
    //=====================================
    public boolean deleta(Veiculo veiculo) {
        try {
            PreparedStatement comandoSQL;
            comandoSQL = Conection.getInstance().prepareStatement(
                    "DELETE FROM veiculo WHERE cod =  ?");
            comandoSQL.setLong(1, veiculo.getCod());
            comandoSQL.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //LISTAR TODOS
    //=====================================
    public ArrayList lista() {
        try {
            PreparedStatement comandoSQL;
            comandoSQL = Conection.getInstance().prepareStatement("SELECT * FROM veiculo");
            ResultSet rs = comandoSQL.executeQuery();
            ArrayList arlVeiculos = new ArrayList();
            while (rs.next()) {
                Veiculo veic = new Veiculo();
                veic.setCod(rs.getInt("cod"));
                veic.setMarca(rs.getString("marca"));
                veic.setModelo(rs.getString("modelo"));
                veic.setCor(rs.getString("cor"));
                veic.setPlaca(rs.getString("placa"));
                veic.setNomeProp(rs.getString("nomeprop"));
                veic.setTelProp(rs.getString("telprop"));
                veic.setCpfProp(rs.getString("cpfprop"));
                arlVeiculos.add(veic);
            }
            return arlVeiculos;
            // conection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//CONSULTA ESPECIFICA POR CAMPOS
//=====================================
    public Veiculo consulta(int pk) {
        try {
            PreparedStatement comandoSQL;
            comandoSQL = Conection.getInstance().prepareStatement("SELECT * FROM veiculo WHERE cod=?");
            comandoSQL.setInt(1, pk);
            ResultSet rs = comandoSQL.executeQuery();
            if (rs.next()) {
                Veiculo veic = new Veiculo();
                veic.setCod(rs.getInt("cod"));
                veic.setMarca(rs.getString("marca"));
                veic.setModelo(rs.getString("modelo"));
                veic.setCor(rs.getString("cor"));
                veic.setPlaca(rs.getString("placa"));
                veic.setNomeProp(rs.getString("nomeprop"));
                veic.setTelProp(rs.getString("telprop"));
                veic.setCpfProp(rs.getString("cpfprop"));
                return veic;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
