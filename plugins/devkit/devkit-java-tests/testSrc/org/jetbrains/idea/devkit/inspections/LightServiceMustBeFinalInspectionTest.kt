// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package org.jetbrains.idea.devkit.inspections

import com.intellij.testFramework.TestDataPath
import org.jetbrains.idea.devkit.DevkitJavaTestsUtil
import org.jetbrains.idea.devkit.inspections.quickfix.LightServiceMustBeFinalInspectionTestBase

@TestDataPath("\$CONTENT_ROOT/testData/inspections/lightServiceMustBeFinal")
class LightServiceMustBeFinalInspectionTest : LightServiceMustBeFinalInspectionTestBase() {

  override fun getBasePath() = DevkitJavaTestsUtil.TESTDATA_PATH + "inspections/lightServiceMustBeFinal/"

  override fun getFileExtension() = "java"

  fun testMakeFinal() {
    doTest("Make 'MyService' final")
  }
}
