package it.sevenbits.springtutorial.core.service;

import it.sevenbits.springtutorial.core.repository.ContentRepository;
import it.sevenbits.springtutorial.exception.RepositoryException;
import it.sevenbits.springtutorial.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService {
    private Logger log = Logger.getLogger(ContentService.class);

    private final ContentRepository repository;

    @Autowired
    public ContentService(ContentRepository repository) {
        this.repository = repository;
    }

    public void createContent(final String content) throws ServiceException {
        try {
            if (content != null && !content.isEmpty()) {
                log.info(String.format("Creation of \'%s\' content", content));
                repository.createContent(content);
            } else {
                final String error = "Content is empty or null";
                log.error(error);
                throw new ServiceException(error);
            }
        } catch (RepositoryException e) {
            final String error = "Error occurred while creating new content";
            log.error(error);
            throw new ServiceException(error, e);
        } catch (Exception e) {
            final String error = "Error occurred while checking content";
            log.error(error);
            throw new ServiceException(error, e);
        }
    }
}
