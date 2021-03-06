/*
 * Copyright 2015 Camilo Bermudez <camilobermudez85@gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hibernateinstrumentator.jboss;

import java.util.List;

/**
 * Service interface. Defines the operations and attributes made available by
 * the hibernate instrumentator MBean.
 * 
 * @author Camilo Bermudez <camilobermudez85@gmail.com>
 *
 */
public interface InstrumentatorMBean {

	/**
	 * Lists all hibernate session factories available in the configured JNDI
	 * base namespaces.
	 * 
	 * @return all session factories
	 */
	public List<String> listSessionFactories();

	/**
	 * Exposes hibernate MBeans through JMX for every session factory found in
	 * the configured JNDI namespaces.
	 * 
	 * @return informative message
	 */
	public String instrumentAll();

	/**
	 * Exposes hibernate MBeans through JMX for the session factory found at the
	 * JNDI name provided.
	 * 
	 * @param jndiName
	 *            session factory JNDI name
	 * @return informative message
	 */
	public String instrument(String jndiName);
}
