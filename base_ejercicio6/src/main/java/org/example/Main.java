package org.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static org.example.OperacionesCRUDPilotos.*;

public class Main {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        String urlConexion = "jdbc:postgresql://localhost:5432/f1-2006";
        String usuario = "postgres";
        String password = "postgres";
        Piloto piloto;
        int id;
        List<Piloto> pilotos = new ArrayList<Piloto>();
        try (Connection conexion = DriverManager.getConnection(urlConexion, usuario, password)) {
            try {
                // Por defecto, el gestor de base de datos ejecuta una operaciÃ³n de confirmaciÃ³n despuÃ©s de la ejecuciÃ³n de cada sentencia de SQL.
                // Para desactivar la confirmaciÃ³n automÃ¡tica e iniciar asÃ­ una transacciÃ³n, invocamos el mÃ©todo Connection.setAutoCommit(false).


                conexion.setAutoCommit(false);


                String seleccionarPiloto = "SELECT * FROM drivers";

                PreparedStatement sentencia = conexion.prepareStatement(seleccionarPiloto);

                ResultSet resultados = sentencia.executeQuery();

                while (resultados.next()){
                    int driverid = resultados.getInt("driverid");
                    String code = resultados.getString("code");
                    String forename = resultados.getString("forename");
                    String surname = resultados.getString("surname");
                    Date dob = resultados.getDate("dob");
                    String nationality = resultados.getString("nationality");
                    int constructorid = resultados.getInt("constructorid");
                    String url = resultados.getString("url");
                    pilotos.add(new Piloto(driverid,constructorid,code,forename,surname,dob,nationality,url));
                }

// ------------------------------------ INSERT -----------------------------------------

               String insertarPiloto = "INSERT INTO drivers (driverid, code, forename, surname, dob, nationality, constructorid, url) " +
                        "VALUES (?,?,?,?,?,?,?,?)";

                sentencia = conexion.prepareStatement(insertarPiloto);

                String  code, forename, surname, nationality, url ;
                int driverid , constructorid;
                Date dob;

               System.out.println("Escribe el id del piloto a insertar");

                driverid = entrada.nextInt();

                System.out.println("Escribe el codigo del piloto a insertar");

                code = entrada.nextLine();
                code = entrada.nextLine();

                System.out.println("Escribe el nombre del piloto a insertar");

                forename = entrada.nextLine();

                System.out.println("Escribe el apellido del piloto a insertar");

                surname = entrada.nextLine();

                System.out.println("Escribe la fecha de competicion a insertar");

                dob = Date.valueOf(entrada.nextLine());

                System.out.println("Escribe la nacionalidad del piloto a insertar");

                nationality = entrada.nextLine();

                System.out.println("Escribe el constructorid del piloto a insertar");

                constructorid = entrada.nextInt();

                System.out.println("Escribe la url del piloto a insertar");

                url = entrada.nextLine();
                url = entrada.nextLine();

                piloto = new Piloto(driverid,constructorid,code,forename,surname,dob,nationality,url);

                pilotos.add(piloto);

                crearPiloto(sentencia,piloto); 

                // --------------------------------- SELECT --------------------------------

                seleccionarPiloto = "SELECT * FROM drivers where driverid=?";

                sentencia = conexion.prepareStatement(seleccionarPiloto);

                System.out.println("Escribe el driverid del piloto a buscar");

                id = entrada.nextInt();

                leerPiloto(sentencia,pilotos,id); 


                // ----------------------SELECT ALL ------------------------

               seleccionarPiloto = "SELECT * FROM drivers";

                sentencia = conexion.prepareStatement(seleccionarPiloto);

                leerPilotos(sentencia); 

                //  ----------------- UPDATE ------------------------

                String actualizarPiloto = "UPDATE drivers set code=? , forename=? , surname=? , dob=? , nationality=? , constructorid=? , url=? WHERE driverid=?";

                sentencia = conexion.prepareStatement(actualizarPiloto);

                System.out.println("Escribe el id del piloto que quiere actualizar");

                       driverid = entrada.nextInt();

                       System.out.println("Escribe el codigo del piloto a actualizar");

                       code = entrada.nextLine();
                      code = entrada.nextLine();

                      System.out.println("Escribe el nombre del piloto a actualizar");

                        forename = entrada.nextLine();

                       System.out.println("Escribe el apellido del piloto a actualizar");

                       surname = entrada.nextLine();

                       System.out.println("Escribe la fecha de competicion a actualizar");

                       dob = Date.valueOf(entrada.nextLine());

                        System.out.println("Escribe la nacionalidad del piloto a actualizar");

                        nationality = entrada.nextLine();

                       System.out.println("Escribe el constructorid del piloto a actualizar");

                        constructorid = entrada.nextInt();

                      System.out.println("Escribe la url del piloto a actualizar");

                      url = entrada.nextLine();
                      url = entrada.nextLine();

                       piloto = new Piloto(driverid,constructorid,code,forename,surname,dob,nationality,url);

                  actualizarPiloto(sentencia,piloto,pilotos); 

                //     -------------------- DELETE --------------------------------

                String borrarPiloto = "DELETE * FROM drivers where driverid=?";

                sentencia = conexion.prepareStatement(borrarPiloto);
                System.out.println("Escribe el id del piloto que quieres borrar");

                      driverid = entrada.nextInt();

                      System.out.println("Escribe el codigo del piloto a borrar");

                       code = entrada.nextLine();
                       code = entrada.nextLine();

                     System.out.println("Escribe el nombre del piloto a borrar");

                     forename = entrada.nextLine();

                       System.out.println("Escribe el apellido del piloto a borrar");

                       surname = entrada.nextLine();

                       System.out.println("Escribe la fecha de competicion a borrar");

                       dob = Date.valueOf(entrada.nextLine());

                        System.out.println("Escribe la nacionalidad del piloto a borrar");

                        nationality = entrada.nextLine();

                       System.out.println("Escribe el constructorid del piloto a borrar");

                       constructorid = entrada.nextInt();

                     System.out.println("Escribe la url del piloto a borrar");

                      url = entrada.nextLine();
                      url = entrada.nextLine();

                        piloto = new Piloto(driverid,constructorid,code,forename,surname,dob,nationality,url);


                borrarPiloto(sentencia,piloto,pilotos); 


        // ------------------------------- Mostrar Posiciones finales -------------------------------------------------

                String sql = "SELECT d.code, sum(r.points) AS points " +
                       "FROM drivers d JOIN results r ON d.driverid = r.driverid \n" +
                        "group by d.code order by sum(r.points) DEsc";

                sentencia= conexion.prepareStatement(sql);

                mostrarClasificacionPiloto(sentencia);  


                // -------------------------------- Constructores ------------------------------

                sql = "SELECT c.name, SUM(r.points) AS Puntos " +
                        "FROM constructors c INNER JOIN drivers d " +
                        "ON c.constructorid = d.constructorid " +
                        "INNER JOIN results r ON d.driverid = r.driverid " +
                        "GROUP BY c.constructorid ORDER BY puntos DESC";

                sentencia= conexion.prepareStatement(sql);

                mostrarClasificacionConstructores(sentencia); 


                // ------------------------ CallableStatement -----------------------------------------

                CallableStatement llamada = conexion.prepareCall("{CALL get_results_by_driver(?)}");
                llamada.setString(1,"ALO");
                llamada.execute();
                ResultSet rs=llamada.getResultSet();

                while (rs.next()) {
                    Integer round = rs.getInt("round");
                    String circuit = rs.getString("circuit");
                    Integer result = rs.getInt("result");
                    Integer points = rs.getInt("points");
                    Date date = rs.getDate("date");
                    System.out.println(round + ", " + circuit + ", " + result + ", " + points + ", " + date);
                }

                conexion.commit();

                conexion.setAutoCommit(true);

            } catch (SQLException ex1) {
                conexion.rollback();
                System.err.println(ex1.getClass().getName() + ": " + ex1.getMessage());

            }
        } catch (SQLException ex) {
            System.err.println(ex.getClass().getName() + ": " + ex.getMessage());
        }
    }

}