package com.myproject.mydomain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SInformationSchemaCatalogName is a Querydsl query type for SInformationSchemaCatalogName
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SInformationSchemaCatalogName extends com.querydsl.sql.RelationalPathBase<SInformationSchemaCatalogName> {

    private static final long serialVersionUID = 883117562;

    public static final SInformationSchemaCatalogName informationSchemaCatalogName = new SInformationSchemaCatalogName("INFORMATION_SCHEMA_CATALOG_NAME");

    public final StringPath catalogName = createString("catalogName");

    public SInformationSchemaCatalogName(String variable) {
        super(SInformationSchemaCatalogName.class, forVariable(variable), "INFORMATION_SCHEMA", "INFORMATION_SCHEMA_CATALOG_NAME");
        addMetadata();
    }

    public SInformationSchemaCatalogName(String variable, String schema, String table) {
        super(SInformationSchemaCatalogName.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SInformationSchemaCatalogName(String variable, String schema) {
        super(SInformationSchemaCatalogName.class, forVariable(variable), schema, "INFORMATION_SCHEMA_CATALOG_NAME");
        addMetadata();
    }

    public SInformationSchemaCatalogName(Path<? extends SInformationSchemaCatalogName> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "INFORMATION_SCHEMA_CATALOG_NAME");
        addMetadata();
    }

    public SInformationSchemaCatalogName(PathMetadata metadata) {
        super(SInformationSchemaCatalogName.class, metadata, "INFORMATION_SCHEMA", "INFORMATION_SCHEMA_CATALOG_NAME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catalogName, ColumnMetadata.named("CATALOG_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

