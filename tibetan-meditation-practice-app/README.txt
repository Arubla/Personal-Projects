LOL deleted everything. Let's start again.

The goal of this project is to practice database-based back-end application design. I want to build a program that
accesses review materials for Ligmincha practitioners, who want to read prayers and visualization instructions, look at support images,
or listen to prayers and mantras sung by Tenzin Rinpoche. Maybe even guided meditations.

I'll need:
- a database    - DAOs for querying the database    - Controller for handling requests to the server
-service classes for querying the database from the front-end   - a front-end

* Build the database
    Construct the database and connect it to the DAOs
    Need tables for lineages and practices
    need table for users and their authentications

* construct the DAOs
    Practice DAOs for grabbing practices by lineage (provide the front-end with the list, selection handled from there)
    User DAOs for verifying user access

*construct the controllers
    need a controller for validating and responding to get requests for practices
    need an authentication controller



work log:
11/26/2022 build basics of practice DAO without user authentication TODO: how to send files? Draft practice controller - full vertical slice.