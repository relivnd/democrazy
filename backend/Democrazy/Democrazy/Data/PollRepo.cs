using System.Collections.Generic;
using System.Reflection;
using Microsoft.AspNetCore.DataProtection.KeyManagement;
using WebApplication.Models;

namespace WebApplication.Data
{
    public class PollRepo : IPollsRepo
    {

        public IEnumerable<Poll> GetAllPolls()
        {
            throw new System.NotImplementedException();
        }

        public Poll GetPollById(int id)
        {
            return new Poll();
        }
    }
}