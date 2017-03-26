/*
 * Copyright (c) 2016 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.yangtools.yang.data.codec.xml;

import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import org.opendaylight.yangtools.yang.data.util.codec.TypeAwareCodec;

interface XmlCodec<T> extends TypeAwareCodec<T, NamespaceContext, XMLStreamWriter> {
    /**
     * {@inheritDoc}
     *
     * @throws XMLStreamException from {@link XMLStreamWriter}
     */
    @Override
    void writeValue(XMLStreamWriter ctx, T value) throws XMLStreamException;
}
