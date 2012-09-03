package org.rest.sec.test;

import org.junit.runner.RunWith;
import org.rest.common.persistence.model.INameableEntity;
import org.rest.common.web.base.AbstractSearchRESTIntegrationTest;
import org.rest.sec.spring.client.ClientTestConfig;
import org.rest.sec.spring.context.ContextTestConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ClientTestConfig.class, ContextTestConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class SecSearchRESTIntegrationTest<T extends INameableEntity> extends AbstractSearchRESTIntegrationTest<T> {

    public SecSearchRESTIntegrationTest() {
        super();
    }

}