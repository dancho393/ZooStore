CREATE TABLE item (
                      id UUID PRIMARY KEY,
                      title VARCHAR(255),
                      description VARCHAR(255),
                      vendor VARCHAR(255)
);

CREATE TABLE tag (
                     id BIGINT PRIMARY KEY,
                     title VARCHAR(255),
                     item_id UUID,
                     FOREIGN KEY (item_id) REFERENCES item (id)
);

CREATE TABLE link (
                      id BIGINT PRIMARY KEY,
                      url VARCHAR(255),
                      item_id UUID,
                      FOREIGN KEY (item_id) REFERENCES item (id)
);
