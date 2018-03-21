package com.android.zhr.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.android.zhhr.data.entity.Comic;
import com.android.zhhr.data.entity.db.DBSearchResult;
import com.android.zhhr.data.entity.db.DownInfo;
import com.android.zhhr.data.entity.db.DBChapters;

import com.android.zhr.greendao.gen.ComicDao;
import com.android.zhr.greendao.gen.DBSearchResultDao;
import com.android.zhr.greendao.gen.DownInfoDao;
import com.android.zhr.greendao.gen.DBChaptersDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig comicDaoConfig;
    private final DaoConfig dBSearchResultDaoConfig;
    private final DaoConfig downInfoDaoConfig;
    private final DaoConfig dBChaptersDaoConfig;

    private final ComicDao comicDao;
    private final DBSearchResultDao dBSearchResultDao;
    private final DownInfoDao downInfoDao;
    private final DBChaptersDao dBChaptersDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        comicDaoConfig = daoConfigMap.get(ComicDao.class).clone();
        comicDaoConfig.initIdentityScope(type);

        dBSearchResultDaoConfig = daoConfigMap.get(DBSearchResultDao.class).clone();
        dBSearchResultDaoConfig.initIdentityScope(type);

        downInfoDaoConfig = daoConfigMap.get(DownInfoDao.class).clone();
        downInfoDaoConfig.initIdentityScope(type);

        dBChaptersDaoConfig = daoConfigMap.get(DBChaptersDao.class).clone();
        dBChaptersDaoConfig.initIdentityScope(type);

        comicDao = new ComicDao(comicDaoConfig, this);
        dBSearchResultDao = new DBSearchResultDao(dBSearchResultDaoConfig, this);
        downInfoDao = new DownInfoDao(downInfoDaoConfig, this);
        dBChaptersDao = new DBChaptersDao(dBChaptersDaoConfig, this);

        registerDao(Comic.class, comicDao);
        registerDao(DBSearchResult.class, dBSearchResultDao);
        registerDao(DownInfo.class, downInfoDao);
        registerDao(DBChapters.class, dBChaptersDao);
    }
    
    public void clear() {
        comicDaoConfig.getIdentityScope().clear();
        dBSearchResultDaoConfig.getIdentityScope().clear();
        downInfoDaoConfig.getIdentityScope().clear();
        dBChaptersDaoConfig.getIdentityScope().clear();
    }

    public ComicDao getComicDao() {
        return comicDao;
    }

    public DBSearchResultDao getDBSearchResultDao() {
        return dBSearchResultDao;
    }

    public DownInfoDao getDownInfoDao() {
        return downInfoDao;
    }

    public DBChaptersDao getDBChaptersDao() {
        return dBChaptersDao;
    }

}
