/**
 * Copyright (C) 2019 CCCIS Casualty (admin@aisreview.com)
 */
package com.cccis.casualty.data.aisbillaround;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.apache.avro.generic.GenericRecord;
import org.infrastructurebuilder.IBConstants;
import org.infrastructurebuilder.data.DefaultAvroGenericRecordStreamSupplier;
import org.infrastructurebuilder.data.IBDataSet;
import org.infrastructurebuilder.data.IBDataStream;
import org.infrastructurebuilder.data.InjectIBData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectIBData.class) // Injects this build's IBDataSet into test params (like the setup() below)
public class TestAIS {

  private IBDataSet workingSet;

  public TestAIS() {
  }

  @BeforeEach
  public void setUp(IBDataSet ds) throws Exception {
    this.workingSet = ds;
  }

  @Test
  public void test() {
    assertEquals(1,1);
  }

}
