package org.redhat.appdev;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeTransactionResourceIT extends TransactionResourceTest {

    // Execute the same tests but in native mode.
}