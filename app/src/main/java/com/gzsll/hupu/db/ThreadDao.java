package com.gzsll.hupu.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table THREAD.
 */
public class ThreadDao extends AbstractDao<Thread, Void> {

  public static final String TABLENAME = "THREAD";

  /**
   * Properties of entity Thread.<br/>
   * Can be used for QueryBuilder and for referencing column names.
   */
  public static class Properties {
    public final static Property Tid = new Property(0, String.class, "tid", false, "TID");
    public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
    public final static Property Puid = new Property(2, String.class, "puid", false, "PUID");
    public final static Property Fid = new Property(3, String.class, "fid", false, "FID");
    public final static Property Replies =
        new Property(4, String.class, "replies", false, "REPLIES");
    public final static Property UserName =
        new Property(5, String.class, "userName", false, "USER_NAME");
    public final static Property Time = new Property(6, String.class, "time", false, "TIME");
    public final static Property ForumName =
        new Property(7, String.class, "forumName", false, "FORUM_NAME");
    public final static Property LightReply =
        new Property(8, Integer.class, "lightReply", false, "LIGHT_REPLY");
    public final static Property Type = new Property(9, Integer.class, "type", false, "TYPE");
  }

  ;

  public ThreadDao(DaoConfig config) {
    super(config);
  }

  public ThreadDao(DaoConfig config, DaoSession daoSession) {
    super(config, daoSession);
  }

  /** Creates the underlying database table. */
  public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
    String constraint = ifNotExists ? "IF NOT EXISTS " : "";
    db.execSQL("CREATE TABLE " + constraint + "'THREAD' (" + //
        "'TID' TEXT," + // 0: tid
        "'TITLE' TEXT," + // 1: title
        "'PUID' TEXT," + // 2: puid
        "'FID' TEXT," + // 3: fid
        "'REPLIES' TEXT," + // 4: replies
        "'USER_NAME' TEXT," + // 5: userName
        "'TIME' TEXT," + // 6: time
        "'FORUM_NAME' TEXT," + // 7: forumName
        "'LIGHT_REPLY' INTEGER," + // 8: lightReply
        "'TYPE' INTEGER);"); // 9: type
  }

  /** Drops the underlying database table. */
  public static void dropTable(SQLiteDatabase db, boolean ifExists) {
    String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'THREAD'";
    db.execSQL(sql);
  }

  /** @inheritdoc */
  @Override protected void bindValues(SQLiteStatement stmt, Thread entity) {
    stmt.clearBindings();

    String tid = entity.getTid();
    if (tid != null) {
      stmt.bindString(1, tid);
    }

    String title = entity.getTitle();
    if (title != null) {
      stmt.bindString(2, title);
    }

    String puid = entity.getPuid();
    if (puid != null) {
      stmt.bindString(3, puid);
    }

    String fid = entity.getFid();
    if (fid != null) {
      stmt.bindString(4, fid);
    }

    String replies = entity.getReplies();
    if (replies != null) {
      stmt.bindString(5, replies);
    }

    String userName = entity.getUserName();
    if (userName != null) {
      stmt.bindString(6, userName);
    }

    String time = entity.getTime();
    if (time != null) {
      stmt.bindString(7, time);
    }

    String forumName = entity.getForumName();
    if (forumName != null) {
      stmt.bindString(8, forumName);
    }

    Integer lightReply = entity.getLightReply();
    if (lightReply != null) {
      stmt.bindLong(9, lightReply);
    }

    Integer type = entity.getType();
    if (type != null) {
      stmt.bindLong(10, type);
    }
  }

  /** @inheritdoc */
  @Override public Void readKey(Cursor cursor, int offset) {
    return null;
  }

  /** @inheritdoc */
  @Override public Thread readEntity(Cursor cursor, int offset) {
    Thread entity = new Thread( //
        cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // tid
        cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
        cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // puid
        cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // fid
        cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // replies
        cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // userName
        cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // time
        cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // forumName
        cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // lightReply
        cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9) // type
    );
    return entity;
  }

  /** @inheritdoc */
  @Override public void readEntity(Cursor cursor, Thread entity, int offset) {
    entity.setTid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
    entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
    entity.setPuid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
    entity.setFid(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
    entity.setReplies(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
    entity.setUserName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
    entity.setTime(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
    entity.setForumName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
    entity.setLightReply(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
    entity.setType(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
  }

  /** @inheritdoc */
  @Override protected Void updateKeyAfterInsert(Thread entity, long rowId) {
    // Unsupported or missing PK type
    return null;
  }

  /** @inheritdoc */
  @Override public Void getKey(Thread entity) {
    return null;
  }

  /** @inheritdoc */
  @Override protected boolean isEntityUpdateable() {
    return true;
  }
}
