/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PanelBotonesCancion.java,v 1.3 2006/08/10 20:08:30 da-romer Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n8_discotienda 
 * Autor: Nicol�s L�pez - 06/12/2005 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package uniandes.cupi2.discotienda.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Es el panel con los botones para agregar una nueva canci�n
 */
public class PanelBotonesCancion extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * El comando para crear una canci�n
     */
    private static final String CREAR_CANCION = "CrearCancion";

    /**
     * El comando para cancelar la creaci�n de una canci�n
     */
    private static final String CANCELAR = "Cancelar";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es una referencia al dialogo al que pertenece este panel
     */
    private DialogoCrearCancion ventana;

    // -----------------------------------------------------------------
    // Atributos de la Interfaz
    // -----------------------------------------------------------------

    /**
     * Es el boton que sirve para agregar una nueva canci�n
     */
    private JButton botonAgregarCancion;

    /**
     * Es el bot�n que sirve para cerrar el di�logo sin guardar los cambios
     */
    private JButton botonCancelar;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el panel e inicializa sus componentes
     * @param dcc es una referencia al di�logo que contiene a este panel
     */
    public PanelBotonesCancion( DialogoCrearCancion dcc )
    {

        ventana = dcc;

        botonAgregarCancion = new JButton( "Crear" );
        botonAgregarCancion.setActionCommand( CREAR_CANCION );
        botonAgregarCancion.addActionListener( this );
        add( botonAgregarCancion );

        botonCancelar = new JButton( "Cancelar" );
        botonCancelar.setActionCommand( CANCELAR );
        botonCancelar.addActionListener( this );
        add( botonCancelar );

    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Ejecuta las acciones asociadas a los eventos
     * @param evento es el evento del click sobre un bot�n
     */
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( CREAR_CANCION.equals( comando ) )
        {
            ventana.crearCancion( );
        }
        else if( CANCELAR.equals( comando ) )
        {
            ventana.dispose( );
        }

    }

}
