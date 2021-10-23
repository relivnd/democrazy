using System.Collections;
using System.Collections.Generic;
using WebApplication.Models;

namespace WebApplication.Data
{
    public interface IPollsRepo
    {
        IEnumerable<Poll> GetAllPolls();
        Poll GetPollById(int id);

    }
}