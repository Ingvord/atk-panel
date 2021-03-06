/*
 *
 *   Copyright (C) :	2009,2010,2011,2012, 2013, 2014, 2015
 *			European Synchrotron Radiation Facility
 *			BP 220, Grenoble 38043
 *			FRANCE
 *
 *   This file is part of Tango.
 *
 *   Tango is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 * 
 *   Tango is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 * 
 *   You should have received a copy of the GNU General Public License
 *   along with Tango.  If not, see <http: //www.gnu.org/licenses/>.
 *
 *  
 *   File          :   RawImagePanel.java
 *  
 *   Project       :   atkpanel generic java application
 *  
 *   Description   :   The panel to display a  Raw image attribute
 *  
 *   Author        :   Faranguiss Poncet
 *  
 *   Original      :   April 2009
 *  
 *   $Revision$				$Author$
 *   $Date$					$State$
 *  
 */

package atkpanel;

/**
 *
 * @author  poncet
 */

import javax.swing.JScrollPane;


import fr.esrf.tangoatk.core.IRawImage;
import fr.esrf.tangoatk.widget.attribute.RawImageViewer;

public class RawImagePanel extends javax.swing.JPanel
{

    private JScrollPane             jScrollPane1;
    private RawImageViewer          riv;
    private IRawImage               riModel;


    /** Creates new form ImagePanel */
    public RawImagePanel()
    {
        riModel = null;
	initComponents();
    }

    /** Creates new form ImagePanel to display a NumberSpectrum attribute */
    public RawImagePanel(IRawImage  riAtt)
    {
        initComponents();
	riModel = riAtt;
        riv.setModel(riModel);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents()
    {
            java.awt.GridBagConstraints       gridBagConstraints1;
	    
	    
            gridBagConstraints1 = new java.awt.GridBagConstraints();
            jScrollPane1 = new javax.swing.JScrollPane();
            riv = new RawImageViewer();
            
            setLayout(new java.awt.GridBagLayout());

            gridBagConstraints1.gridx = 0;
            gridBagConstraints1.gridy = 0;
            gridBagConstraints1.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints1.insets = new java.awt.Insets(3, 3, 3, 5);
            gridBagConstraints1.weightx = 1.0;
            gridBagConstraints1.weighty = 1.0;
            add(jScrollPane1, gridBagConstraints1);
        
            jScrollPane1.setViewportView(riv);
        
    }
    
    protected IRawImage getModel()
    {
       return riModel;
    }

    
    protected void clearModel()
    {
       if (riModel == null) return;
       if (riv == null) return;
       riv.clearModel();
    }

}
