-- src/main/resources/data.sql

-- Insert dummy data into the user table
INSERT INTO "user" (id, name, category, bio, contact_options, links, followers, following, account_reached, account_engaged, total_stories, total_follows, total_posts, total_saves, total_comments, total_shares) VALUES
(1, 'John Doe', 'Influencer', 'Lifestyle blogger', 'john@example.com', 'http://example.com/john', 1000, 200, 300, 150, 10, 50, 100, 25, 30, 40),
(2, 'Jane Smith', 'Business', 'Tech entrepreneur', 'jane@example.com', 'http://example.com/jane', 5000, 300, 1000, 500, 20, 60, 200, 35, 40, 50),
(3, 'Alice Johnson', 'Fashion', 'Fashion model', 'alice@example.com', 'http://example.com/alice', 8000, 400, 2000, 1000, 30, 70, 300, 45, 50, 60);

-- Insert dummy data into the post table
INSERT INTO "post" (id, user_id, content, created_at, likes, comments, shares) VALUES
(1, 1, 'Check out my latest blog post!', '2024-01-01 10:00:00', 150, 20, 5),
(2, 1, 'Enjoying a sunny day at the beach!', '2024-01-02 11:00:00', 200, 30, 10),
(3, 2, 'Launching a new tech product next month!', '2024-01-03 12:00:00', 250, 40, 15),
(4, 3, 'New fashion trends for the summer.', '2024-01-04 13:00:00', 300, 50, 20);

-- Insert dummy data into the ad table
INSERT INTO "ad" (id, user_id, content, created_at, insights) VALUES
(1, 1, 'Ad content 1', '2024-01-05 10:00:00', 500),
(2, 2, 'Ad content 2', '2024-01-06 11:00:00', 600),
(3, 3, 'Ad content 3', '2024-01-07 12:00:00', 700);

-- Insert dummy data into the promotion table
INSERT INTO "promotion" (id, user_id, content, created_at, active) VALUES
(1, 1, 'Promotion content 1', '2024-01-08 10:00:00', true),
(2, 2, 'Promotion content 2', '2024-01-09 11:00:00', false),
(3, 3, 'Promotion content 3', '2024-01-10 12:00:00', true);
