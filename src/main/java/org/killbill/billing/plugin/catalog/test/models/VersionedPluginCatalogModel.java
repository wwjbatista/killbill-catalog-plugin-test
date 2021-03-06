/*
 * Copyright 2014-2015 Groupon, Inc
 * Copyright 2014-2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.plugin.catalog.test.models;

import org.killbill.billing.catalog.api.BillingMode;
import org.killbill.billing.catalog.plugin.api.StandalonePluginCatalog;
import org.killbill.billing.catalog.plugin.api.VersionedPluginCatalog;

public class VersionedPluginCatalogModel implements VersionedPluginCatalog {
    private final String catalogName;

    private final BillingMode billingMode;

    private final Iterable<StandalonePluginCatalog> standalonePluginCatalogs;

    public VersionedPluginCatalogModel(final String catalogName,
                                       final BillingMode billingMode,
                                       final Iterable<StandalonePluginCatalog> standalonePluginCatalogs) {
        this.catalogName = catalogName;
        this.billingMode = billingMode;
        this.standalonePluginCatalogs = standalonePluginCatalogs;
    }

    @Override
    public String getCatalogName() {
        return catalogName;
    }

    @Override
    public BillingMode getRecurringBillingMode() {
        return billingMode;
    }

    @Override
    public Iterable<StandalonePluginCatalog> getStandalonePluginCatalogs() {
        return standalonePluginCatalogs;
    }
}
