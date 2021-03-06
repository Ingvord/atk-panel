/*
 *
 *   Copyright (C) :	2007,2008,2009,2010,2011,2012, 2013, 2014, 2015
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
 *  
 *   File          :   StringImagePanel.java
 *  
 *   Project       :   atkpanel generic java application
 *  
 *   Description   :   The panel to display a  String image attribute
 *  
 *   Author        :   Faranguiss Poncet
 *  
 *   Original      :   May 2007
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

import fr.esrf.tangoatk.core.IStringImage;
import fr.esrf.tangoatk.widget.attribute.StringImageTableViewer;

public class StringImagePanel extends JPanel
{

    private StringImageTableViewer       sitv=null;
    private IStringImage                 siModel=null;


    /** Creates new form StringImagePanel */
    public StringImagePanel()
    {
        siModel = null;
	initComponents();
    }

    /** Creates new form StringImagePanel to display a StringImage attribute */
    public StringImagePanel(IStringImage  siAtt)
    {
        initComponents();
	siModel = siAtt;
        sitv.setAttModel(siModel);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents()
    {
        java.awt.GridBagConstraints       gbc=new java.awt.GridBagConstraints();

        setLayout(new java.awt.GridBagLayout());

        sitv = new StringImageTableViewer();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = java.awt.GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new java.awt.Insets(3, 3, 3, 5);
        add(sitv, gbc);
    }
    
    protected IStringImage getModel()
    {
       return siModel;
    }

    
    protected void clearModel()
    {
       if (siModel == null) return;
       if (sitv == null) return;
       sitv.clearModel();
    }

}
