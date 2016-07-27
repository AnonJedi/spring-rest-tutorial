package it.sevenbits.springtutorial.core.repository;

import it.sevenbits.springtutorial.core.mapper.ContentMapper;
import it.sevenbits.springtutorial.exception.RepositoryException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ContentRepository {

    private final Logger log = Logger.getLogger(ContentRepository.class);
    private final ContentMapper mapper;

    @Autowired
    public ContentRepository(ContentMapper mapper) {
        this.mapper = mapper;
    }

    @Transactional
    public void createContent(final String content) throws RepositoryException {
        try {
            mapper.create(content);
        } catch (Exception e) {
            final String error = String.format("Error occurred while saving \"%s\" content to db", content);
            log.error(error);
            throw new RepositoryException(error, e);
        }
    }
}
