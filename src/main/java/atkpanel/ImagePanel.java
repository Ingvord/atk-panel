/*
 *
 *   Copyright (C) :	2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012
 *                      2013, 2014, 2015
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
 *   File          :   ImagePanel.java
 *  
 *   Project       :   atkpanel generic java application
 *  
 *   Description   :   The panel to display a  number image attribute
 *  
 *   Author        :   Faranguiss Poncet
 *  
 *   Original      :   Mars 2002
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

import javax.swing.JPanel;
import javax.swing.JScrollPane;


import fr.esrf.tangoatk.core.INumberImage;
import fr.esrf.tangoatk.core.attribute.NumberImage;
import fr.esrf.tangoatk.widget.attribute.NumberImageViewer;

public class ImagePanel extends javax.swing.JPanel
{

    private JScrollPane             jScrollPane1;
    private JPanel                  jPanel1;
    private NumberImageViewer       imageViewer1;
    private INumberImage            niModel;


    /** Creates new form ImagePanel */
    public ImagePanel()
    {
        niModel = null;
	initComponents();
    }

    /** Creates new form ImagePanel to display a NumberSpectrum attribute */
    public ImagePanel(INumberImage  niAtt)
    {
        initComponents();
	niModel = niAtt;
        imageViewer1.setModel(niAtt);
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
            imageViewer1 = new NumberImageViewer();
            
            setLayout(new java.awt.GridBagLayout());

            gridBagConstraints1.gridx = 0;
            gridBagConstraints1.gridy = 0;
            gridBagConstraints1.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints1.insets = new java.awt.Insets(3, 3, 3, 5);
            gridBagConstraints1.weightx = 1.0;
            gridBagConstraints1.weighty = 1.0;
            add(jScrollPane1, gridBagConstraints1);
        
            jScrollPane1.setViewportView(imageViewer1);
        
    }
    
    protected INumberImage getModel()
    {
       return niModel;
    }

    
    protected void clearModel()
    {
       if (niModel == null) return;
       if (imageViewer1 == null) return;
       imageViewer1.clearModel();
       
       if (niModel instanceof NumberImage)
       {
           NumberImage   ni = (NumberImage) niModel;
           ni.freeInternalData();
       }
    }

}
