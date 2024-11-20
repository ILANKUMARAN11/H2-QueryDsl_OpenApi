package com.sql.relation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SEnumValues is a Querydsl query type for SEnumValues
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SEnumValues extends com.querydsl.sql.RelationalPathBase<SEnumValues> {

    private static final long serialVersionUID = -1879964367;

    public static final SEnumValues enumValues = new SEnumValues("ENUM_VALUES");

    public final StringPath enumIdentifier = createString("enumIdentifier");

    public final StringPath objectCatalog = createString("objectCatalog");

    public final StringPath objectName = createString("objectName");

    public final StringPath objectSchema = createString("objectSchema");

    public final StringPath objectType = createString("objectType");

    public final StringPath valueName = createString("valueName");

    public final StringPath valueOrdinal = createString("valueOrdinal");

    public SEnumValues(String variable) {
        super(SEnumValues.class, forVariable(variable), "INFORMATION_SCHEMA", "ENUM_VALUES");
        addMetadata();
    }

    public SEnumValues(String variable, String schema, String table) {
        super(SEnumValues.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SEnumValues(String variable, String schema) {
        super(SEnumValues.class, forVariable(variable), schema, "ENUM_VALUES");
        addMetadata();
    }

    public SEnumValues(Path<? extends SEnumValues> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "ENUM_VALUES");
        addMetadata();
    }

    public SEnumValues(PathMetadata metadata) {
        super(SEnumValues.class, metadata, "INFORMATION_SCHEMA", "ENUM_VALUES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(enumIdentifier, ColumnMetadata.named("ENUM_IDENTIFIER").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(objectCatalog, ColumnMetadata.named("OBJECT_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(objectName, ColumnMetadata.named("OBJECT_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(objectSchema, ColumnMetadata.named("OBJECT_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(objectType, ColumnMetadata.named("OBJECT_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(valueName, ColumnMetadata.named("VALUE_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(valueOrdinal, ColumnMetadata.named("VALUE_ORDINAL").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
    }

}
