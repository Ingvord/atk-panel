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
 *  
 *   File          :   SpectrumPanel.java
 *  
 *   Project       :   atkpanel generic java application
 *  
 *   Description   :   The panel to display a  number spectrum attribute
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

import fr.esrf.tangoatk.core.INumberScalar;
import fr.esrf.tangoatk.core.INumberSpectrum;
import fr.esrf.tangoatk.widget.attribute.NumberSpectrumViewer;

public class SpectrumPanel extends javax.swing.JPanel
{

    private INumberSpectrum            nsModel;
    private NumberSpectrumViewer       numberSpectrumViewer;

    /** Creates new form SpectrumPanel */
    public SpectrumPanel()
    {
        nsModel = null;
	initComponents();
    }

    /** Creates new form SpectrumPanel to display a NumberSpectrum attribute */
    public SpectrumPanel(INumberSpectrum  nsAtt)
    {
        initComponents();
	nsModel = nsAtt;
        numberSpectrumViewer.setModel(nsAtt);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents()
    {
	java.awt.GridBagConstraints gridBagConstraints;

	setLayout(new java.awt.GridBagLayout());
	numberSpectrumViewer = new NumberSpectrumViewer(); 
	numberSpectrumViewer.setBackground(java.awt.Color.WHITE);           
	numberSpectrumViewer.setManageXaxis(true);

	gridBagConstraints = new java.awt.GridBagConstraints();
	gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
	gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
	gridBagConstraints.gridx = 0;
	gridBagConstraints.gridy = 0;
	gridBagConstraints.weightx = 1.0;
	gridBagConstraints.weighty = 1.0;
	add(numberSpectrumViewer, gridBagConstraints);
    }

    
    protected INumberSpectrum getModel()
    {
       return nsModel;
    }
    
    protected void setXminXmaxModels(INumberScalar minAtt, INumberScalar maxAtt)
    {
        if ((minAtt == null) || (maxAtt == null)) return;
        if ( minAtt == maxAtt ) return;
        numberSpectrumViewer.setXaxisModels(minAtt, maxAtt);
    }

    
    protected void clearModel()
    {
       if (nsModel == null) return;
       if (numberSpectrumViewer == null) return;
       numberSpectrumViewer.setModel(null);
    }

}
