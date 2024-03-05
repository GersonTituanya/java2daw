package Principal;

import java.util.*;

public class BookCollection {

    public static int cantidadMasQuinientos(ArrayList lista){

        int numPaginas , cantidad=0;

        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            numPaginas=a.getPaginas();

            if(numPaginas>500){

                cantidad++;
            }

        }

        return cantidad;
    }


    public static int cantidadMenosTrescientos(ArrayList lista){

        int numPaginas , cantidad=0;

        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            numPaginas=a.getPaginas();

            if(numPaginas<300){

                cantidad++;
            }

        }

        return cantidad;
    }


    public static void listarTitulosCantidadMasQuinientos(ArrayList lista){

        int numPaginas ;

        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            numPaginas=a.getPaginas();

            if(numPaginas>500){

                System.out.println(a.getAutor());

            }

        }


    }



    public static void obtenerTitulosTresMasPaginas(ArrayList lista){

        int numPaginas , min=0 , mind=0 , minf=0 , cont=3;
        String tituloAnterior="";

        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            numPaginas=a.getPaginas();

            if(numPaginas>min){

                min=numPaginas;
            }

            if(numPaginas>mind&&numPaginas!=min){

                mind=numPaginas;
            }

            if(numPaginas>minf&&numPaginas!=mind&&numPaginas!=min){

                minf=numPaginas;
            }


            if(cont>0&&a.getTitulo()!=tituloAnterior){


                if(cont>0&&lista.contains(min)){
                    System.out.println(a.getTitulo());
                    tituloAnterior=a.getTitulo();
                    cont--;
                }

                else if(cont>0&&lista.contains(mind)&&numPaginas!=min){
                    System.out.println(a.getTitulo());
                    tituloAnterior=a.getTitulo();
                    cont--;
                }
                else if(cont>0&&lista.contains(minf)&&numPaginas!=mind&&numPaginas!=min){
                    System.out.println(a.getTitulo());
                    tituloAnterior=a.getTitulo();
                    cont--;
                }


            }


        }
    }



    public int sumaTotalPaginas(ArrayList lista){

        int numPaginas , totalPaginas=0;

        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            numPaginas=a.getPaginas();

            totalPaginas = totalPaginas+numPaginas;

        }
        return totalPaginas;

    }



    public static void mayorPromedio(ArrayList lista){

        int numPaginas , totalPaginas=0;
        float promedio;
        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            numPaginas=a.getPaginas();

            totalPaginas = totalPaginas+numPaginas;

        }
        promedio=totalPaginas/lista.size();

        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            if(a.getPaginas()>promedio){

                System.out.println(a.lista);
            }

        }

    }







    public static void obtenerTodosAutores(ArrayList lista){

        ArrayList autores =new ArrayList();
        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            if(!autores.contains(a.getAutor())){

                System.out.println(a.getAutor());
                autores.add(a.getAutor());

            }

        }
    }


    public static void autoresMasUnLibro(ArrayList lista){

        ArrayList autores =new ArrayList();

        int cont=0 , contNombre=0;
        String nombreAutor;

        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            nombreAutor=a.getAutor();

            do{

                if(nombreAutor==a.getAutor()){

                    contNombre++;
                }

                cont++;
            }while(cont<lista.size());

            if(contNombre==1){

                autores.add(a.getAutor());
            }
        }
        System.out.println(autores);
    }




    public static void libroMayorNumPaginas(ArrayList lista){

        int numPaginas , min=0;


        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            numPaginas=a.getPaginas();

            if(numPaginas>min){

                min=numPaginas;
            }

        }


        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            if(a.getPaginas()==min){
                System.out.println(a.getTitulo());
            }

        }

    }



    public static ArrayList obtenerTodosTitulos(ArrayList lista){

        ArrayList titulos =new ArrayList();
        for(Iterator it= lista.iterator() ; it.hasNext() ; ){

            Book a = (Book)it.next();

            if(!titulos.contains(a.getTitulo())){

                System.out.println(a.getTitulo());
                titulos.add(a.getAutor());

            }

        }
        return titulos;
    }



}