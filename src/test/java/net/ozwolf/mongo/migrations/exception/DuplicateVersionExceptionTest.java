package net.ozwolf.mongo.migrations.exception;

import net.ozwolf.mongo.migrations.internal.domain.Migration;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DuplicateVersionExceptionTest {
    @Test
    public void shouldProvideExpectedExceptionMessage() {
        Migration migration = mock(Migration.class);
        when(migration.getVersion()).thenReturn("1.2.3");

        assertThat(new DuplicateVersionException(migration).getMessage()).isEqualTo("Migration [ 1.2.3 ] has duplicate commands.");
    }
}