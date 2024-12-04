package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO extends DAO {
	
	//CRIANDO O CONSTRUTOR
	public UsuarioDAO() {
		super();
	}
	
	//INSERIR CLIENTE
	public void inserirUsuarioCliente(Usuario usuario) throws Exception{
		//QUERY
		String sql ="INSERT INTO usuario (nome, telefone, login, senha,perfil_idPerfil) VALUES (?,?, '1', '1', '2');";
		
		try {
			//CONENCTANDO
			Connection con = conectar();
			
			//PASSANDO A QUERY
			PreparedStatement pst = con.prepareStatement(sql);
			
			//SETANDO OS ATRIBUTOS
			pst.setString(1, usuario.getNome());
			pst.setString(2, usuario.getTelefone());
			pst.setString(3, usuario.getLogin());
			pst.setString(4, usuario.getSenha());
			pst.setInt(5, usuario.getIdPerfil());
			
			pst.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//INSERIR COLABORADOR
		public void inserirUsuarioColaborador(Usuario usuario) throws Exception{
			//QUERY
			String sql ="INSERT INTO usuario (nome, telefone, login, senha,perfil_idPerfil) VALUES (?,?,?,?, '3');";
			
			try {
				//CONENCTANDO
				Connection con = conectar();
				
				//PASSANDO A QUERY
				PreparedStatement pst = con.prepareStatement(sql);
				
				//SETANDO OS ATRIBUTOS
				pst.setString(1, usuario.getNome());
				pst.setString(2, usuario.getTelefone());
				pst.setString(3, usuario.getLogin());
				pst.setString(4, usuario.getSenha());
				pst.setInt(5, usuario.getIdPerfil());
				
				pst.executeUpdate();
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	//LISTAR
	public ArrayList<Usuario> listarUsuarioCliente(){
		ArrayList<Usuario> usuario = new ArrayList<Usuario>();
		String sql = "SELECT * FROM usuario where perfil_idPerfil='2' order by nome;";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				Usuario u = new Usuario();
				u.setIdUsuario(rs.getInt("idUsuario"));
				u.setNome(rs.getNString("nome"));
				u.setTelefone(rs.getString("telefone"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				u.setIdPerfil(rs.getInt("perfil_idPerfil"));
				usuario.add(u);
			}
			con.close();
			return usuario;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public ArrayList<Usuario> listarUsuarioColaborador(){
		ArrayList<Usuario> usuario = new ArrayList<Usuario>();
		String sql = "SELECT * FROM usuario where perfil_idPerfil='3' order by nome;";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				Usuario u = new Usuario();
				u.setIdUsuario(rs.getInt("idUsuario"));
				u.setNome(rs.getNString("nome"));
				u.setTelefone(rs.getString("telefone"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				u.setIdPerfil(rs.getInt("perfil_idPerfil"));
				usuario.add(u);
			}
			con.close();
			return usuario;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	//SELECIONAR USUARIO
	public void carregarPorID (Usuario usuario) {
		String sql="SELECT * FROM usuario WHERE idUsuario=?;";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, usuario.getIdUsuario());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				usuario.setIdUsuario(rs.getInt(1));
				usuario.setNome(rs.getString(2));
				usuario.setTelefone(rs.getString(3));
				usuario.setLogin(rs.getString(4));
				usuario.setSenha(rs.getString(5));
				usuario.setIdPerfil(rs.getInt(6));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//EDITAR
	public void alterarUsuario(Usuario usuario) {
		String sql="UPDATE usuario set nome=?, teleone=?, login=?, senha=?, perfil_idPerfil=? WHERE idUsuario=?;";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, usuario.getNome());
			pst.setString(2, usuario.getTelefone());
			pst.setString(3, usuario.getLogin());
			pst.setString(4, usuario.getSenha());
			pst.setInt(5, usuario.getIdPerfil());
			pst.setInt(6, usuario.getIdUsuario());
			
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// EXCLUIR USUARIO
		public void excluir(Usuario usuario) {
			String sql = "DELETE FROM usuario WHERE idUsuario=?";

			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, usuario.getIdUsuario());
				pst.executeUpdate();

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		public Usuario logar (String login, String senha) throws Exception{
			String sql = "SELECT * FROM usuario WHERE login=?";
			
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
	        ResultSet rs;
	        
	        pst.setString(1, login);

	        rs = pst.executeQuery();
	        Usuario u = new Usuario();
	        if (rs.next()) {
	            if (senha.equals(rs.getString("senha"))) {
	                
	            	u.setIdUsuario(rs.getInt("idUsuario"));
	                u.setNome(rs.getString("nome"));
	                u.setTelefone(rs.getString("telefone"));
	                u.setLogin(rs.getString("login"));
	                u.setSenha(rs.getString("senha"));
	                u.setIdPerfil(rs.getInt("idPerfil"));
	                
	                /*PerfilDAO pDB = new PerfilDAO();
	                pDB.conectar();
	                Perfil p = pDB.carregaPorId(u.getId_perfil());
	                con.close();
	                
	                u.setPerfil(p);*/
	            }
	        }
	        return u;
		}
	
}
