/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.arm.resources.models;

import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.management.apigeneration.Fluent;

/**
 * Base interface used by child resources.
 * @param <ParentT> parent interface
 */
@Fluent
public interface ChildResource<ParentT> extends
        Indexable,
        HasName,
        HasParent<ParentT> {
}
