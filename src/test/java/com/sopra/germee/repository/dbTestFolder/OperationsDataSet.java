package com.sopra.germee.repository.dbTestFolder;

import java.io.FileInputStream;
import java.io.InputStream;

import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;

public class OperationsDataSet {
    public static void chargerDataset(IDatabaseConnection dbUnitConnection, String datasetFilename) throws Exception {
        InputStream inputStreamXML = new FileInputStream(datasetFilename);

        FlatXmlDataSetBuilder xmlDSBuilder = new FlatXmlDataSetBuilder();
        xmlDSBuilder.setCaseSensitiveTableNames(false);

        IDataSet dataSet = xmlDSBuilder.build(inputStreamXML);

        DatabaseOperation.CLEAN_INSERT.execute(dbUnitConnection, dataSet);
    }

    public static void fermerConnexion(IDatabaseConnection dbUnitConnection) throws Exception {
        dbUnitConnection.close();
    }
}
